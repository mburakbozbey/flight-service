//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.14 at 12:29:54 AM EET 
//


package com.mburakbozbey.xml.flights;

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
 *         &lt;element name="searchCriteria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="searchKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "searchCriteria",
    "searchKey"
})
@XmlRootElement(name = "FlightSearchRequest")
public class FlightSearchRequest {

    protected int searchCriteria;
    @XmlElement(required = true)
    protected String searchKey;

    /**
     * Gets the value of the searchCriteria property.
     * 
     */
    public int getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     */
    public void setSearchCriteria(int value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the searchKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchKey() {
        return searchKey;
    }

    /**
     * Sets the value of the searchKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchKey(String value) {
        this.searchKey = value;
    }

}
