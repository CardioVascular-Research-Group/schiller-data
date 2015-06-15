package org.cvrgrid.schiller;

import java.util.List;

import org.cvrgrid.schiller.jaxb.beans.ComXiriuzSemaXmlSchillerEDISchillerEDI;

public class PreprocessReturn {

	private ComXiriuzSemaXmlSchillerEDISchillerEDI comXiriuzSemaXmlSchillerEDISchillerEDI;
	private DecodedLead[] decodedLeads;
	private String prepSampleRate;
	private List<String> leadNames;
	
	public PreprocessReturn(ComXiriuzSemaXmlSchillerEDISchillerEDI comXiriuzSemaXmlSchillerEDISchillerEDI, DecodedLead[] decodedLeads, String prepSampleRate) {
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

	public List<String> getLeadNames() {
		return leadNames;
	}

	public void setLeadNames(List<String> leadNames) {
		this.leadNames = leadNames;
	}
	public List<String> getLeadNames() {
		return leadNames;
	}

	public void setLeadNames(List<String> leadNames) {
		this.leadNames = leadNames;
	}
}
