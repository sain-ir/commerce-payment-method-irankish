
package com.sain.commerce.payment.method.irankish.ikc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="MakeTokenResult" type="{http://schemas.datacontract.org/2004/07/Token}tokenResponse" minOccurs="0"/>
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
    "makeTokenResult"
})
@XmlRootElement(name = "MakeTokenResponse")
public class MakeTokenResponse {

    @XmlElementRef(name = "MakeTokenResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TokenResponse> makeTokenResult;

    /**
     * Gets the value of the makeTokenResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TokenResponse }{@code >}
     *     
     */
    public JAXBElement<TokenResponse> getMakeTokenResult() {
        return makeTokenResult;
    }

    /**
     * Sets the value of the makeTokenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TokenResponse }{@code >}
     *     
     */
    public void setMakeTokenResult(JAXBElement<TokenResponse> value) {
        this.makeTokenResult = value;
    }

}
