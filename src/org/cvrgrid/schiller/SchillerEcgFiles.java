package org.cvrgrid.schiller;

//import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
//import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.cvrgrid.schiller.PreprocessReturn;
import org.cvrgrid.schiller.jaxb.beans.ComXiriuzSemaXmlSchillerEDISchillerEDI;
import org.cvrgrid.schiller.jaxb.beans.Wavedata;
import org.cvrgrid.schiller.jaxb.beans.Channel;

public final class SchillerEcgFiles {
	static String samplingRate = "";
	private SchillerEcgFiles() {
	}

	private static PreprocessReturn preprocess(JAXBContext context, File input) throws JAXBException, IOException {
		Unmarshaller reader = context.createUnmarshaller();
		ComXiriuzSemaXmlSchillerEDISchillerEDI comxiriuzsemaxmlschilleredischilleredi = (ComXiriuzSemaXmlSchillerEDISchillerEDI)reader.unmarshal(input);
		
		PreprocessReturn temp = new PreprocessReturn(comxiriuzsemaxmlschilleredischilleredi, extractLeads(comxiriuzsemaxmlschilleredischilleredi), samplingRate);
		
		return temp;
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
	
	public static DecodedLead[] extractLeads(ComXiriuzSemaXmlSchillerEDISchillerEDI input) throws IOException {

	    ArrayList<int[]> leadData = new ArrayList<int[]>();		
		List<Wavedata> list =  input.getEventdata().getEvent().getWavedata();
		for (Wavedata wd : list) {
	    	if (wd.getType().equalsIgnoreCase("ecg_rhythms")){
		    	samplingRate = wd.getResolution().getSamplerate().getValue();
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
	    
		DecodedLead[] leads = DecodedLead.createFromLeadSet(leadData);
		return leads;
	}
	
	public static DecodedLead[] extractLeads(File input) throws IOException, JAXBException {
		JAXBContext context = JAXBContext.newInstance("org.cvrgrid.schiller.jaxb.beans");
		
		Unmarshaller reader = context.createUnmarshaller();
		ComXiriuzSemaXmlSchillerEDISchillerEDI comxiriuzsemaxmlschilleredischilleredi = (ComXiriuzSemaXmlSchillerEDISchillerEDI)reader.unmarshal(input);
		
		return extractLeads(comxiriuzsemaxmlschilleredischilleredi);
	}
}