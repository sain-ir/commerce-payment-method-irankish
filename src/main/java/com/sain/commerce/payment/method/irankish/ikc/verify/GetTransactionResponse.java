
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
 *         &lt;element name="getTransactionResult" type="{http://schemas.datacontract.org/2004/07/VerifyPayment}transactionModel" minOccurs="0"/>
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
    "getTransactionResult"
})
@XmlRootElement(name = "getTransactionResponse")
public class GetTransactionResponse {

    @XmlElementRef(name = "getTransactionResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TransactionModel> getTransactionResult;

    /**
     * Gets the value of the getTransactionResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransactionModel }{@code >}
     *     
     */
    public JAXBElement<TransactionModel> getGetTransactionResult() {
        return getTransactionResult;
    }

    /**
     * Sets the value of the getTransactionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransactionModel }{@code >}
     *     
     */
    public void setGetTransactionResult(JAXBElement<TransactionModel> value) {
        this.getTransactionResult = value;
    }

}
