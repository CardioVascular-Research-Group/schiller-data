package org.cvrgrid.schiller;

import org.cvrgrid.schiller.jaxb.beans.ComXiriuzSemaXmlSchillerEDISchillerEDI;

public class PreprocessReturn {

	private ComXiriuzSemaXmlSchillerEDISchillerEDI comXiriuzSemaXmlSchillerEDISchillerEDI;
	private DecodedLead[] decodedLeads;
	private String prepSampleRate;
	
	public PreprocessReturn(ComXiriuzSemaXmlSchillerEDISchillerEDI comXiriuzSemaXmlSchillerEDISchillerEDI, DecodedLead[] decodedLeads, String prepSampleRate) {
		super();
		this.comXiriuzSemaXmlSchillerEDISchillerEDI = comXiriuzSemaXmlSchillerEDISchillerEDI;
		this.decodedLeads = decodedLeads;
		this.prepSampleRate = prepSampleRate;
	}

	public ComXiriuzSemaXmlSchillerEDISchillerEDI getComXiriuzSemaXmlSchillerEDISchillerEDI() {
		return comXiriuzSemaXmlSchillerEDISchillerEDI;
	}
	public void setComXiriuzSemaXmlSchillerEDISchillerEDI(ComXiriuzSemaXmlSchillerEDISchillerEDI comXiriuzSemaXmlSchillerEDISchillerEDI) {
		this.comXiriuzSemaXmlSchillerEDISchillerEDI = comXiriuzSemaXmlSchillerEDISchillerEDI;
	}
	public DecodedLead[] getDecodedLeads() {
		return decodedLeads;
	}
	public void setDecodedLeads(DecodedLead[] decodedLeads) {
		this.decodedLeads = decodedLeads;
	}
	public String getPrepSampleRate() {
		return prepSampleRate;
	}
	public void setPrepSampleRate(String prepSampleRate) {
		this.prepSampleRate = prepSampleRate;
	}
	
	
}
