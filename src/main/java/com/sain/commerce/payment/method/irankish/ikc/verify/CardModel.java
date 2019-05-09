
package com.sain.commerce.payment.method.irankish.ikc.verify;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardModel", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", propOrder = {
    "cardNo",
    "hCode"
})
public class CardModel {

    @XmlElementRef(name = "CardNo", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardNo;
    @XmlElementRef(name = "HCode", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hCode;

    /**
     * Gets the value of the cardNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardNo() {
        return cardNo;
    }

    /**
     * Sets the value of the cardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardNo(JAXBElement<String> value) {
        this.cardNo = value;
    }

    /**
     * Gets the value of the hCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHCode() {
        return hCode;
    }

    /**
     * Sets the value of the hCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHCode(JAXBElement<String> value) {
        this.hCode = value;
    }

}
