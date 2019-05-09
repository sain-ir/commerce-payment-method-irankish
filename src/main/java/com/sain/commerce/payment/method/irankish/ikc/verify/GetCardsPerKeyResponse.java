
package com.sain.commerce.payment.method.irankish.ikc.verify;

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
 *         &lt;element name="GetCardsPerKeyResult" type="{http://schemas.datacontract.org/2004/07/VerifyPayment}ArrayOfCardModel" minOccurs="0"/>
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
    "getCardsPerKeyResult"
})
@XmlRootElement(name = "GetCardsPerKeyResponse")
public class GetCardsPerKeyResponse {

    @XmlElementRef(name = "GetCardsPerKeyResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCardModel> getCardsPerKeyResult;

    /**
     * Gets the value of the getCardsPerKeyResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCardModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCardModel> getGetCardsPerKeyResult() {
        return getCardsPerKeyResult;
    }

    /**
     * Sets the value of the getCardsPerKeyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCardModel }{@code >}
     *     
     */
    public void setGetCardsPerKeyResult(JAXBElement<ArrayOfCardModel> value) {
        this.getCardsPerKeyResult = value;
    }

}
