//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.10 at 11:26:05 AM EDT 
//


package org.cvrgrid.schiller.jaxb.beans;

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
 *         &lt;element ref="{}hardware"/>
 *         &lt;element ref="{}software"/>
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
    "hardware",
    "software"
})
@XmlRootElement(name = "aquiringdevice")
public class Aquiringdevice {

    @XmlElement(required = true)
    protected Hardware hardware;
    @XmlElement(required = true)
    protected Software software;

    /**
     * Gets the value of the hardware property.
     * 
     * @return
     *     possible object is
     *     {@link Hardware }
     *     
     */
    public Hardware getHardware() {
        return hardware;
    }

    /**
     * Sets the value of the hardware property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hardware }
     *     
     */
    public void setHardware(Hardware value) {
        this.hardware = value;
    }

    /**
     * Gets the value of the software property.
     * 
     * @return
     *     possible object is
     *     {@link Software }
     *     
     */
    public Software getSoftware() {
        return software;
    }

    /**
     * Sets the value of the software property.
     * 
     * @param value
     *     allowed object is
     *     {@link Software }
     *     
     */
    public void setSoftware(Software value) {
        this.software = value;
    }

}