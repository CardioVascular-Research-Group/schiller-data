//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.10 at 11:26:05 AM EDT 
//


package org.cvrgrid.schiller.jaxb.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}offset"/>
 *         &lt;element ref="{}reason"/>
 *         &lt;element ref="{}step"/>
 *         &lt;element ref="{}wavedata" maxOccurs="unbounded"/>
 *         &lt;element ref="{}annotation_global" maxOccurs="unbounded"/>
 *         &lt;element ref="{}rhythm_global" maxOccurs="unbounded"/>
 *         &lt;element ref="{}filters_data"/>
 *         &lt;element ref="{}textdata" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "offset",
    "reason",
    "step",
    "wavedata",
    "annotationGlobal",
    "rhythmGlobal",
    "filtersData",
    "textdata"
})
@XmlRootElement(name = "event")
public class Event {

    protected boolean offset;
    @XmlElement(required = true)
    protected String reason;
    protected boolean step;
    @XmlElement(required = true)
    protected List<Wavedata> wavedata;
    @XmlElement(name = "annotation_global", required = true)
    protected List<AnnotationGlobal> annotationGlobal;
    @XmlElement(name = "rhythm_global", required = true)
    protected List<RhythmGlobal> rhythmGlobal;
    @XmlElement(name = "filters_data", required = true)
    protected FiltersData filtersData;
    @XmlElement(required = true)
    protected List<Textdata> textdata;

    /**
     * Gets the value of the offset property.
     * 
     */
    public boolean isOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     */
    public void setOffset(boolean value) {
        this.offset = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the step property.
     * 
     */
    public boolean isStep() {
        return step;
    }

    /**
     * Sets the value of the step property.
     * 
     */
    public void setStep(boolean value) {
        this.step = value;
    }

    /**
     * Gets the value of the wavedata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wavedata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWavedata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Wavedata }
     * 
     * 
     */
    public List<Wavedata> getWavedata() {
        if (wavedata == null) {
            wavedata = new ArrayList<Wavedata>();
        }
        return this.wavedata;
    }

    /**
     * Gets the value of the annotationGlobal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotationGlobal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotationGlobal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnotationGlobal }
     * 
     * 
     */
    public List<AnnotationGlobal> getAnnotationGlobal() {
        if (annotationGlobal == null) {
            annotationGlobal = new ArrayList<AnnotationGlobal>();
        }
        return this.annotationGlobal;
    }

    /**
     * Gets the value of the rhythmGlobal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rhythmGlobal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRhythmGlobal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RhythmGlobal }
     * 
     * 
     */
    public List<RhythmGlobal> getRhythmGlobal() {
        if (rhythmGlobal == null) {
            rhythmGlobal = new ArrayList<RhythmGlobal>();
        }
        return this.rhythmGlobal;
    }

    /**
     * Gets the value of the filtersData property.
     * 
     * @return
     *     possible object is
     *     {@link FiltersData }
     *     
     */
    public FiltersData getFiltersData() {
        return filtersData;
    }

    /**
     * Sets the value of the filtersData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltersData }
     *     
     */
    public void setFiltersData(FiltersData value) {
        this.filtersData = value;
    }

    /**
     * Gets the value of the textdata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textdata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextdata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Textdata }
     * 
     * 
     */
    public List<Textdata> getTextdata() {
        if (textdata == null) {
            textdata = new ArrayList<Textdata>();
        }
        return this.textdata;
    }

}
