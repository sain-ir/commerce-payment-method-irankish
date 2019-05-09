
package com.sain.commerce.payment.method.irankish.ikc.verify;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CARDNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXTRAPARAM1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXTRAPARAM2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXTRAPARAM3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXTRAPARAM4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MERCHANTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYMENTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFERENCENUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESULTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ROWNUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SETTLEMENTDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPECIALPAYMENTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRANSDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VERIFYDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VERIFYRESPONSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionModel", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", propOrder = {
    "amount",
    "cardno",
    "extraparam1",
    "extraparam2",
    "extraparam3",
    "extraparam4",
    "merchantid",
    "paymentid",
    "referencenumber",
    "resultcode",
    "rownumber",
    "settlementdate",
    "specialpaymentid",
    "transdate",
    "verifydate",
    "verifyresponse",
    "invoceNo"
})
public class TransactionModel {

    @XmlElementRef(name = "AMOUNT", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> amount;
    @XmlElementRef(name = "CARDNO", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardno;
    @XmlElementRef(name = "EXTRAPARAM1", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extraparam1;
    @XmlElementRef(name = "EXTRAPARAM2", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extraparam2;
    @XmlElementRef(name = "EXTRAPARAM3", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extraparam3;
    @XmlElementRef(name = "EXTRAPARAM4", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extraparam4;
    @XmlElementRef(name = "MERCHANTID", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> merchantid;
    @XmlElementRef(name = "PAYMENTID", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentid;
    @XmlElementRef(name = "REFERENCENUMBER", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referencenumber;
    @XmlElementRef(name = "RESULTCODE", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resultcode;
    @XmlElementRef(name = "ROWNUMBER", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rownumber;
    @XmlElementRef(name = "SETTLEMENTDATE", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> settlementdate;
    @XmlElementRef(name = "SPECIALPAYMENTID", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialpaymentid;
    @XmlElementRef(name = "TRANSDATE", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transdate;
    @XmlElementRef(name = "VERIFYDATE", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> verifydate;
    @XmlElementRef(name = "VERIFYRESPONSE", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> verifyresponse;
    @XmlElementRef(name = "invoceNo", namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoceNo;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAMOUNT(JAXBElement<String> value) {
        this.amount = value;
    }

    /**
     * Gets the value of the cardno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCARDNO() {
        return cardno;
    }

    /**
     * Sets the value of the cardno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCARDNO(JAXBElement<String> value) {
        this.cardno = value;
    }

    /**
     * Gets the value of the extraparam1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEXTRAPARAM1() {
        return extraparam1;
    }

    /**
     * Sets the value of the extraparam1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXTRAPARAM1(JAXBElement<String> value) {
        this.extraparam1 = value;
    }

    /**
     * Gets the value of the extraparam2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEXTRAPARAM2() {
        return extraparam2;
    }

    /**
     * Sets the value of the extraparam2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXTRAPARAM2(JAXBElement<String> value) {
        this.extraparam2 = value;
    }

    /**
     * Gets the value of the extraparam3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEXTRAPARAM3() {
        return extraparam3;
    }

    /**
     * Sets the value of the extraparam3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXTRAPARAM3(JAXBElement<String> value) {
        this.extraparam3 = value;
    }

    /**
     * Gets the value of the extraparam4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEXTRAPARAM4() {
        return extraparam4;
    }

    /**
     * Sets the value of the extraparam4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXTRAPARAM4(JAXBElement<String> value) {
        this.extraparam4 = value;
    }

    /**
     * Gets the value of the merchantid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMERCHANTID() {
        return merchantid;
    }

    /**
     * Sets the value of the merchantid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMERCHANTID(JAXBElement<String> value) {
        this.merchantid = value;
    }

    /**
     * Gets the value of the paymentid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPAYMENTID() {
        return paymentid;
    }

    /**
     * Sets the value of the paymentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPAYMENTID(JAXBElement<String> value) {
        this.paymentid = value;
    }

    /**
     * Gets the value of the referencenumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREFERENCENUMBER() {
        return referencenumber;
    }

    /**
     * Sets the value of the referencenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREFERENCENUMBER(JAXBElement<String> value) {
        this.referencenumber = value;
    }

    /**
     * Gets the value of the resultcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESULTCODE() {
        return resultcode;
    }

    /**
     * Sets the value of the resultcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESULTCODE(JAXBElement<String> value) {
        this.resultcode = value;
    }

    /**
     * Gets the value of the rownumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getROWNUMBER() {
        return rownumber;
    }

    /**
     * Sets the value of the rownumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setROWNUMBER(JAXBElement<String> value) {
        this.rownumber = value;
    }

    /**
     * Gets the value of the settlementdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSETTLEMENTDATE() {
        return settlementdate;
    }

    /**
     * Sets the value of the settlementdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSETTLEMENTDATE(JAXBElement<String> value) {
        this.settlementdate = value;
    }

    /**
     * Gets the value of the specialpaymentid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSPECIALPAYMENTID() {
        return specialpaymentid;
    }

    /**
     * Sets the value of the specialpaymentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSPECIALPAYMENTID(JAXBElement<String> value) {
        this.specialpaymentid = value;
    }

    /**
     * Gets the value of the transdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRANSDATE() {
        return transdate;
    }

    /**
     * Sets the value of the transdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRANSDATE(JAXBElement<String> value) {
        this.transdate = value;
    }

    /**
     * Gets the value of the verifydate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVERIFYDATE() {
        return verifydate;
    }

    /**
     * Sets the value of the verifydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVERIFYDATE(JAXBElement<String> value) {
        this.verifydate = value;
    }

    /**
     * Gets the value of the verifyresponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVERIFYRESPONSE() {
        return verifyresponse;
    }

    /**
     * Sets the value of the verifyresponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVERIFYRESPONSE(JAXBElement<String> value) {
        this.verifyresponse = value;
    }

    /**
     * Gets the value of the invoceNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoceNo() {
        return invoceNo;
    }

    /**
     * Sets the value of the invoceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoceNo(JAXBElement<String> value) {
        this.invoceNo = value;
    }

}
