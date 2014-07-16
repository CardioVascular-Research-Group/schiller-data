//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.16 at 12:18:45 PM PDT 
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
 *         &lt;element ref="{}annotation_lead" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}data"/>
 *         &lt;element ref="{}datastype"/>
 *         &lt;element ref="{}samplecount"/>
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
    "annotationLead",
    "name",
    "data",
    "datastype",
    "samplecount"
})
@XmlRootElement(name = "channel")
public class Channel {

    @XmlElement(name = "annotation_lead")
    protected List<AnnotationLead> annotationLead;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String data;
    @XmlElement(required = true)
    protected String datastype;
    protected short samplecount;

    /**
     * Gets the value of the annotationLead property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotationLead property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotationLead().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnotationLead }
     * 
     * 
     */
    public List<AnnotationLead> getAnnotationLead() {
        if (annotationLead == null) {
            annotationLead = new ArrayList<AnnotationLead>();
        }
        return this.annotationLead;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Gets the value of the datastype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatastype() {
        return datastype;
    }

    /**
     * Sets the value of the datastype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatastype(String value) {
        this.datastype = value;
    }

    /**
     * Gets the value of the samplecount property.
     * 
     */
    public short getSamplecount() {
        return samplecount;
    }

    /**
     * Sets the value of the samplecount property.
     * 
     */
    public void setSamplecount(short value) {
        this.samplecount = value;
    }

}
