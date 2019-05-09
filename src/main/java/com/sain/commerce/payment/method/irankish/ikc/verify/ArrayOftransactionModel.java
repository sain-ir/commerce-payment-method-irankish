
package com.sain.commerce.payment.method.irankish.ikc.verify;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ArrayOftransactionModel complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOftransactionModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionModel" type="{http://schemas.datacontract.org/2004/07/VerifyPayment}transactionModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
	name = "ArrayOftransactionModel",
	namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment",
	propOrder = "transactionModel"
)
public class ArrayOftransactionModel {

	/**
	 * Gets the value of the transactionModel property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the transactionModel property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getTransactionModel().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link TransactionModel }
	 *
	 *
	 */
	public List<TransactionModel> getTransactionModel() {
		if (transactionModel == null) {
			transactionModel = new ArrayList<>();
		}

		return this.transactionModel;
	}

	@XmlElement(nillable = true)
	protected List<TransactionModel> transactionModel;

}