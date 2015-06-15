package org.cvrgrid.schiller;
/*
Copyright 2015 Johns Hopkins University Institute for Computational Medicine

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
/**
* @author David Hopkins, Chris Jurado
* 
*/

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
//import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.cvrgrid.schiller.PreprocessReturn;
import org.cvrgrid.schiller.jaxb.beans.ComXiriuzSemaXmlSchillerEDISchillerEDI;
import org.cvrgrid.schiller.jaxb.beans.Wavedata;
import org.cvrgrid.schiller.jaxb.beans.Channel;

public class SchillerEcgFiles {
	static String schillerSampRate = "";
	private SchillerEcgFiles() {
	}
	
	private static PreprocessReturn preprocess(JAXBContext context, InputStream inputStream) throws JAXBException, IOException {
		
		Unmarshaller reader = context.createUnmarshaller();
		ComXiriuzSemaXmlSchillerEDISchillerEDI comxiriuzsemaxmlschilleredischilleredi = (ComXiriuzSemaXmlSchillerEDISchillerEDI)reader.unmarshal(inputStream);

		return preprocessComplete(comxiriuzsemaxmlschilleredischilleredi);
	}

	private static PreprocessReturn preprocess(JAXBContext context, File input) throws JAXBException, IOException {
		Unmarshaller reader = context.createUnmarshaller();
		ComXiriuzSemaXmlSchillerEDISchillerEDI comxiriuzsemaxmlschilleredischilleredi = (ComXiriuzSemaXmlSchillerEDISchillerEDI)reader.unmarshal(input);

		return preprocessComplete(comxiriuzsemaxmlschilleredischilleredi);
	}
	
	private static PreprocessReturn preprocessComplete(ComXiriuzSemaXmlSchillerEDISchillerEDI comxiriuzsemaxmlschilleredischilleredi) throws JAXBException, IOException {
		DecodedLead[] leads = null;
		PreprocessReturn temp = new PreprocessReturn(comxiriuzsemaxmlschilleredischilleredi, leads, schillerSampRate);
		
	    ArrayList<int[]> leadData = new ArrayList<int[]>();		
		List<Wavedata> list =  comxiriuzsemaxmlschilleredischilleredi.getEventdata().getEvent().getWavedata();
		for (Wavedata wd : list) {
	    	if (wd.getType().equalsIgnoreCase("ecg_rhythms")){
		    	temp.setPrepSampleRate(wd.getResolution().getSamplerate().getValue());
		    	List<Channel> channel = wd.getChannel();
		    	for (Channel subChannel : channel) {
		    		String channelData = subChannel.getData(); 	
			    	StringTokenizer tokenizer = new StringTokenizer(channelData, ",");
		    	    int n = tokenizer.countTokens();
		    	    int[] list1 = new int[n];
		    		for (int i = 0; i < n; i++) {
		    	    	String token = tokenizer.nextToken();
		    	    	list1[i] = Integer.parseInt(token);
		    	    }
	    	    	leadData.add(list1);
		    	}
	    	}
	    }
		temp.setDecodedLeads(DecodedLead.createFromLeadSet(leadData));
		return temp;
	}
	
	public static PreprocessReturn preprocess(InputStream inputStream) throws IOException, JAXBException {
		JAXBContext context = JAXBContext.newInstance("org.cvrgrid.schiller.jaxb.beans");
		
		return preprocess(context, inputStream);
	}
	
	public static PreprocessReturn preprocess(File input) throws IOException, JAXBException {
		JAXBContext context = JAXBContext.newInstance("org.cvrgrid.schiller.jaxb.beans");
		
		return preprocess(context, input);
	}
	
	public static void preprocess(File input, File output) throws IOException, JAXBException {
		JAXBContext context = JAXBContext.newInstance("org.cvrgrid.schiller.jaxb.beans");

		PreprocessReturn prepCom = preprocess(context, input);
		
        Marshaller writer = context.createMarshaller();
        writer.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        writer.marshal(prepCom.getComXiriuzSemaXmlSchillerEDISchillerEDI(), output);
	}
}
