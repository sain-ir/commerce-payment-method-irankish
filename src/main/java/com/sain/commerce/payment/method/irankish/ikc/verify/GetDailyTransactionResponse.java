
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
 *         &lt;element name="getDailyTransactionResult" type="{http://schemas.datacontract.org/2004/07/VerifyPayment}ArrayOftransactionModel" minOccurs="0"/>
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
    "getDailyTransactionResult"
})
@XmlRootElement(name = "getDailyTransactionResponse")
public class GetDailyTransactionResponse {

    @XmlElementRef(name = "getDailyTransactionResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOftransactionModel> getDailyTransactionResult;

    /**
     * Gets the value of the getDailyTransactionResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOftransactionModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOftransactionModel> getGetDailyTransactionResult() {
        return getDailyTransactionResult;
    }

    /**
     * Sets the value of the getDailyTransactionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOftransactionModel }{@code >}
     *     
     */
    public void setGetDailyTransactionResult(JAXBElement<ArrayOftransactionModel> value) {
        this.getDailyTransactionResult = value;
    }

}
