//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.14 at 03:06:41 PM EEST 
//


package org.apache.stanbol.cmsadapter.servicesapi.model.mapping;

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
 *         &lt;element name="PredicateName" type="{mapping.model.servicesapi.cmsadapter.stanbol.apache.org}QueryType"/>
 *         &lt;element name="SubjectQuery" type="{mapping.model.servicesapi.cmsadapter.stanbol.apache.org}QueryType" minOccurs="0"/>
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
    "predicateName",
    "subjectQuery"
})
@XmlRootElement(name = "SubsumptionBridge")
public class SubsumptionBridge {

    @XmlElement(name = "PredicateName", required = true)
    protected String predicateName;
    @XmlElement(name = "SubjectQuery")
    protected String subjectQuery;

    /**
     * Gets the value of the predicateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredicateName() {
        return predicateName;
    }

    /**
     * Sets the value of the predicateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredicateName(String value) {
        this.predicateName = value;
    }

    /**
     * Gets the value of the subjectQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectQuery() {
        return subjectQuery;
    }

    /**
     * Sets the value of the subjectQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectQuery(String value) {
        this.subjectQuery = value;
    }

}
