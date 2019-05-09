
package com.sain.commerce.payment.method.irankish.ikc.verify;

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
 *         &lt;element name="KicccPaymentsVerificationResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "KicccPaymentsVerificationResponse")
@XmlType(name = "", propOrder = "kicccPaymentsVerificationResult")
public class KicccPaymentsVerificationResponse {

	/**
	 * Gets the value of the kicccPaymentsVerificationResult property.
	 *
	 * @return
	 *     possible object is
	 *     {@link Long }
	 *
	 */
	public Long getKicccPaymentsVerificationResult() {
		return kicccPaymentsVerificationResult;
	}

	/**
	 * Sets the value of the kicccPaymentsVerificationResult property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link Long }
	 *
	 */
	public void setKicccPaymentsVerificationResult(Long value) {
		this.kicccPaymentsVerificationResult = value;
	}

	@XmlElement(name = "KicccPaymentsVerificationResult")
	protected Long kicccPaymentsVerificationResult;

}