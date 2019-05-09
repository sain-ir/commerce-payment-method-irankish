
package com.sain.commerce.payment.method.irankish.ikc.verify;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sain.commerce.payment.method.irankish.ikc.verify package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _CardModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "CardModel");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _TransactionModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "transactionModel");
    private final static QName _ArrayOftransactionModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "ArrayOftransactionModel");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ArrayOfCardModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "ArrayOfCardModel");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _GetDailyTransactionResponseGetDailyTransactionResult_QNAME = new QName("http://tempuri.org/", "getDailyTransactionResult");
    private final static QName _TransactionModelVERIFYRESPONSE_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "VERIFYRESPONSE");
    private final static QName _TransactionModelAMOUNT_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "AMOUNT");
    private final static QName _TransactionModelRESULTCODE_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "RESULTCODE");
    private final static QName _TransactionModelROWNUMBER_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "ROWNUMBER");
    private final static QName _TransactionModelCARDNO_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "CARDNO");
    private final static QName _TransactionModelEXTRAPARAM2_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "EXTRAPARAM2");
    private final static QName _TransactionModelEXTRAPARAM1_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "EXTRAPARAM1");
    private final static QName _TransactionModelEXTRAPARAM4_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "EXTRAPARAM4");
    private final static QName _TransactionModelEXTRAPARAM3_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "EXTRAPARAM3");
    private final static QName _TransactionModelVERIFYDATE_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "VERIFYDATE");
    private final static QName _TransactionModelSETTLEMENTDATE_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "SETTLEMENTDATE");
    private final static QName _TransactionModelREFERENCENUMBER_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "REFERENCENUMBER");
    private final static QName _TransactionModelMERCHANTID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "MERCHANTID");
    private final static QName _TransactionModelTRANSDATE_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "TRANSDATE");
    private final static QName _TransactionModelPAYMENTID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "PAYMENTID");
    private final static QName _TransactionModelInvoceNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "invoceNo");
    private final static QName _TransactionModelSPECIALPAYMENTID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "SPECIALPAYMENTID");
    private final static QName _GetLimitedTransacctionAmount_QNAME = new QName("http://tempuri.org/", "amount");
    private final static QName _GetLimitedTransacctionMerchantId_QNAME = new QName("http://tempuri.org/", "merchantId");
    private final static QName _GetLimitedTransacctionInvoiceNo_QNAME = new QName("http://tempuri.org/", "invoiceNo");
    private final static QName _GetCardsPerKeyResponseGetCardsPerKeyResult_QNAME = new QName("http://tempuri.org/", "GetCardsPerKeyResult");
    private final static QName _GetDailyTransactionOffset_QNAME = new QName("http://tempuri.org/", "offset");
    private final static QName _GetDailyTransactionLimit_QNAME = new QName("http://tempuri.org/", "limit");
    private final static QName _GetTransactionByIbanIbanNo_QNAME = new QName("http://tempuri.org/", "IbanNo");
    private final static QName _GetTransactionByIbanFromDate_QNAME = new QName("http://tempuri.org/", "fromDate");
    private final static QName _GetTransactionByIbanToDate_QNAME = new QName("http://tempuri.org/", "toDate");
    private final static QName _GetLimitedTransacctionResponseGetLimitedTransacctionResult_QNAME = new QName("http://tempuri.org/", "getLimitedTransacctionResult");
    private final static QName _GetTransactionReferenceNo_QNAME = new QName("http://tempuri.org/", "referenceNo");
    private final static QName _GetTransactionResponseGetTransactionResult_QNAME = new QName("http://tempuri.org/", "getTransactionResult");
    private final static QName _CardModelHCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "HCode");
    private final static QName _CardModelCardNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VerifyPayment", "CardNo");
    private final static QName _KicccPaymentsVerificationReferenceNumber_QNAME = new QName("http://tempuri.org/", "referenceNumber");
    private final static QName _KicccPaymentsVerificationSha1Key_QNAME = new QName("http://tempuri.org/", "sha1Key");
    private final static QName _KicccPaymentsVerificationToken_QNAME = new QName("http://tempuri.org/", "token");
    private final static QName _GetTransactionByIbanResponseGetTransactionByIbanResult_QNAME = new QName("http://tempuri.org/", "getTransactionByIbanResult");
    private final static QName _GetOfflineTransactionResponseGetOfflineTransactionResult_QNAME = new QName("http://tempuri.org/", "getOfflineTransactionResult");
    private final static QName _GetCardsPerKeyKey_QNAME = new QName("http://tempuri.org/", "key");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sain.commerce.payment.method.irankish.ikc.verify
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTransactionResponse }
     * 
     */
    public GetTransactionResponse createGetTransactionResponse() {
        return new GetTransactionResponse();
    }

    /**
     * Create an instance of {@link TransactionModel }
     * 
     */
    public TransactionModel createTransactionModel() {
        return new TransactionModel();
    }

    /**
     * Create an instance of {@link GetDailyTransactionResponse }
     * 
     */
    public GetDailyTransactionResponse createGetDailyTransactionResponse() {
        return new GetDailyTransactionResponse();
    }

    /**
     * Create an instance of {@link ArrayOftransactionModel }
     * 
     */
    public ArrayOftransactionModel createArrayOftransactionModel() {
        return new ArrayOftransactionModel();
    }

    /**
     * Create an instance of {@link GetCardsPerKeyResponse }
     * 
     */
    public GetCardsPerKeyResponse createGetCardsPerKeyResponse() {
        return new GetCardsPerKeyResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCardModel }
     * 
     */
    public ArrayOfCardModel createArrayOfCardModel() {
        return new ArrayOfCardModel();
    }

    /**
     * Create an instance of {@link GetTransactionByIban }
     * 
     */
    public GetTransactionByIban createGetTransactionByIban() {
        return new GetTransactionByIban();
    }

    /**
     * Create an instance of {@link GetCardsPerKey }
     * 
     */
    public GetCardsPerKey createGetCardsPerKey() {
        return new GetCardsPerKey();
    }

    /**
     * Create an instance of {@link KicccPaymentsVerification }
     * 
     */
    public KicccPaymentsVerification createKicccPaymentsVerification() {
        return new KicccPaymentsVerification();
    }

    /**
     * Create an instance of {@link GetDailyTransaction }
     * 
     */
    public GetDailyTransaction createGetDailyTransaction() {
        return new GetDailyTransaction();
    }

    /**
     * Create an instance of {@link GetOfflineTransaction }
     * 
     */
    public GetOfflineTransaction createGetOfflineTransaction() {
        return new GetOfflineTransaction();
    }

    /**
     * Create an instance of {@link KicccPaymentsVerificationResponse }
     * 
     */
    public KicccPaymentsVerificationResponse createKicccPaymentsVerificationResponse() {
        return new KicccPaymentsVerificationResponse();
    }

    /**
     * Create an instance of {@link GetLimitedTransacction }
     * 
     */
    public GetLimitedTransacction createGetLimitedTransacction() {
        return new GetLimitedTransacction();
    }

    /**
     * Create an instance of {@link GetTransactionByIbanResponse }
     * 
     */
    public GetTransactionByIbanResponse createGetTransactionByIbanResponse() {
        return new GetTransactionByIbanResponse();
    }

    /**
     * Create an instance of {@link GetLimitedTransacctionResponse }
     * 
     */
    public GetLimitedTransacctionResponse createGetLimitedTransacctionResponse() {
        return new GetLimitedTransacctionResponse();
    }

    /**
     * Create an instance of {@link GetOfflineTransactionResponse }
     * 
     */
    public GetOfflineTransactionResponse createGetOfflineTransactionResponse() {
        return new GetOfflineTransactionResponse();
    }

    /**
     * Create an instance of {@link GetTransaction }
     * 
     */
    public GetTransaction createGetTransaction() {
        return new GetTransaction();
    }

    /**
     * Create an instance of {@link CardModel }
     * 
     */
    public CardModel createCardModel() {
        return new CardModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "CardModel")
    public JAXBElement<CardModel> createCardModel(CardModel value) {
        return new JAXBElement<CardModel>(_CardModel_QNAME, CardModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "transactionModel")
    public JAXBElement<TransactionModel> createTransactionModel(TransactionModel value) {
        return new JAXBElement<TransactionModel>(_TransactionModel_QNAME, TransactionModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOftransactionModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "ArrayOftransactionModel")
    public JAXBElement<ArrayOftransactionModel> createArrayOftransactionModel(ArrayOftransactionModel value) {
        return new JAXBElement<ArrayOftransactionModel>(_ArrayOftransactionModel_QNAME, ArrayOftransactionModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCardModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "ArrayOfCardModel")
    public JAXBElement<ArrayOfCardModel> createArrayOfCardModel(ArrayOfCardModel value) {
        return new JAXBElement<ArrayOfCardModel>(_ArrayOfCardModel_QNAME, ArrayOfCardModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOftransactionModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getDailyTransactionResult", scope = GetDailyTransactionResponse.class)
    public JAXBElement<ArrayOftransactionModel> createGetDailyTransactionResponseGetDailyTransactionResult(ArrayOftransactionModel value) {
        return new JAXBElement<ArrayOftransactionModel>(_GetDailyTransactionResponseGetDailyTransactionResult_QNAME, ArrayOftransactionModel.class, GetDailyTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "VERIFYRESPONSE", scope = TransactionModel.class)
    public JAXBElement<String> createTransactionModelVERIFYRESPONSE(String value) {
        return new JAXBElement<String>(_TransactionModelVERIFYRESPONSE_QNAME, String.class, TransactionModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "AMOUNT", scope = TransactionModel.class)
    public JAXBElement<String> createTransactionModelAMOUNT(String value) {
        return new JAXBElement<String>(_TransactionModelAMOUNT_QNAME, String.class, TransactionModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "RESULTCODE", scope = TransactionModel.class)
    public JAXBElement<String> createTransactionModelRESULTCODE(String value) {
        return new JAXBElement<String>(_TransactionModelRESULTCODE_QNAME, String.class, TransactionModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "ROWNUMBER", scope = TransactionModel.class)
    public JAXBElement<String> createTransactionModelROWNUMBER(String value) {
        return new JAXBElement<String>(_TransactionModelROWNUMBER_QNAME, String.class, TransactionModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "CARDNO", scope = TransactionModel.class)
    public JAXBElement<String> createTransactionModelCARDNO(String value) {
        return new JAXBElement<String>(_TransactionModelCARDNO_QNAME, String.class, TransactionModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "EXTRAPARAM2", scope = TransactionModel.class)
    public JAXBElement<String> createTransactionModelEXTRAPARAM2(String value) {
        return new JAXBElement<String>(_TransactionModelEXTRAPARAM2_QNAME, String.class, TransactionModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "EXTRAPARAM1", scope = TransactionModel.class)
    public JAXBElement<String> createTransactionModelEXTRAPARAM1(String value) {
        return new JAXBElement<String>(_TransactionModelEXTRAPARAM1_QNAME, String.class, TransactionModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "EXTRAPARAM4", scope = TransactionModel.class)
    public JAXBElement<String> createTransactionModelEXTRAPARAM4(String value) {
        return new JAXBElement<String>(_TransactionModelEXTRAPARAM4_QNAME, String.class, TransactionModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "EXTRAPARAM3", scope = TransactionModel.class)
    public JAXBElement<String> createTransactionModelEXTRAPARAM3(String value) {
        return new JAXBElement<String>(_TransactionModelEXTRAPARAM3_QNAME, String.class, TransactionModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "VERIFYDATE", scope = TransactionModel.class)
    public JAXBElement<String> createTransactionModelVERIFYDATE(String value) {
        return new JAXBElement<String>(_TransactionModelVERIFYDATE_QNAME, String.class, TransactionModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "SETTLEMENTDATE", scope = TransactionModel.class)
    public JAXBElement<String> createTransactionModelSETTLEMENTDATE(String value) {
        return new JAXBElement<String>(_TransactionModelSETTLEMENTDATE_QNAME, String.class, TransactionModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "REFERENCENUMBER", scope = TransactionModel.class)
    public JAXBElement<String> createTransactionModelREFERENCENUMBER(String value) {
        return new JAXBElement<String>(_TransactionModelREFERENCENUMBER_QNAME, String.class, TransactionModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "MERCHANTID", scope = TransactionModel.class)
    public JAXBElement<String> createTransactionModelMERCHANTID(String value) {
        return new JAXBElement<String>(_TransactionModelMERCHANTID_QNAME, String.class, TransactionModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "TRANSDATE", scope = TransactionModel.class)
    public JAXBElement<String> createTransactionModelTRANSDATE(String value) {
        return new JAXBElement<String>(_TransactionModelTRANSDATE_QNAME, String.class, TransactionModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "PAYMENTID", scope = TransactionModel.class)
    public JAXBElement<String> createTransactionModelPAYMENTID(String value) {
        return new JAXBElement<String>(_TransactionModelPAYMENTID_QNAME, String.class, TransactionModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "invoceNo", scope = TransactionModel.class)
    public JAXBElement<String> createTransactionModelInvoceNo(String value) {
        return new JAXBElement<String>(_TransactionModelInvoceNo_QNAME, String.class, TransactionModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "SPECIALPAYMENTID", scope = TransactionModel.class)
    public JAXBElement<String> createTransactionModelSPECIALPAYMENTID(String value) {
        return new JAXBElement<String>(_TransactionModelSPECIALPAYMENTID_QNAME, String.class, TransactionModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "amount", scope = GetLimitedTransacction.class)
    public JAXBElement<String> createGetLimitedTransacctionAmount(String value) {
        return new JAXBElement<String>(_GetLimitedTransacctionAmount_QNAME, String.class, GetLimitedTransacction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "merchantId", scope = GetLimitedTransacction.class)
    public JAXBElement<String> createGetLimitedTransacctionMerchantId(String value) {
        return new JAXBElement<String>(_GetLimitedTransacctionMerchantId_QNAME, String.class, GetLimitedTransacction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "invoiceNo", scope = GetLimitedTransacction.class)
    public JAXBElement<String> createGetLimitedTransacctionInvoiceNo(String value) {
        return new JAXBElement<String>(_GetLimitedTransacctionInvoiceNo_QNAME, String.class, GetLimitedTransacction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCardModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCardsPerKeyResult", scope = GetCardsPerKeyResponse.class)
    public JAXBElement<ArrayOfCardModel> createGetCardsPerKeyResponseGetCardsPerKeyResult(ArrayOfCardModel value) {
        return new JAXBElement<ArrayOfCardModel>(_GetCardsPerKeyResponseGetCardsPerKeyResult_QNAME, ArrayOfCardModel.class, GetCardsPerKeyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "merchantId", scope = GetDailyTransaction.class)
    public JAXBElement<String> createGetDailyTransactionMerchantId(String value) {
        return new JAXBElement<String>(_GetLimitedTransacctionMerchantId_QNAME, String.class, GetDailyTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "offset", scope = GetDailyTransaction.class)
    public JAXBElement<String> createGetDailyTransactionOffset(String value) {
        return new JAXBElement<String>(_GetDailyTransactionOffset_QNAME, String.class, GetDailyTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "limit", scope = GetDailyTransaction.class)
    public JAXBElement<String> createGetDailyTransactionLimit(String value) {
        return new JAXBElement<String>(_GetDailyTransactionLimit_QNAME, String.class, GetDailyTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IbanNo", scope = GetTransactionByIban.class)
    public JAXBElement<String> createGetTransactionByIbanIbanNo(String value) {
        return new JAXBElement<String>(_GetTransactionByIbanIbanNo_QNAME, String.class, GetTransactionByIban.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fromDate", scope = GetTransactionByIban.class)
    public JAXBElement<String> createGetTransactionByIbanFromDate(String value) {
        return new JAXBElement<String>(_GetTransactionByIbanFromDate_QNAME, String.class, GetTransactionByIban.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "toDate", scope = GetTransactionByIban.class)
    public JAXBElement<String> createGetTransactionByIbanToDate(String value) {
        return new JAXBElement<String>(_GetTransactionByIbanToDate_QNAME, String.class, GetTransactionByIban.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "merchantId", scope = GetTransactionByIban.class)
    public JAXBElement<String> createGetTransactionByIbanMerchantId(String value) {
        return new JAXBElement<String>(_GetLimitedTransacctionMerchantId_QNAME, String.class, GetTransactionByIban.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "offset", scope = GetTransactionByIban.class)
    public JAXBElement<String> createGetTransactionByIbanOffset(String value) {
        return new JAXBElement<String>(_GetDailyTransactionOffset_QNAME, String.class, GetTransactionByIban.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "limit", scope = GetTransactionByIban.class)
    public JAXBElement<String> createGetTransactionByIbanLimit(String value) {
        return new JAXBElement<String>(_GetDailyTransactionLimit_QNAME, String.class, GetTransactionByIban.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getLimitedTransacctionResult", scope = GetLimitedTransacctionResponse.class)
    public JAXBElement<TransactionModel> createGetLimitedTransacctionResponseGetLimitedTransacctionResult(TransactionModel value) {
        return new JAXBElement<TransactionModel>(_GetLimitedTransacctionResponseGetLimitedTransacctionResult_QNAME, TransactionModel.class, GetLimitedTransacctionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "merchantId", scope = GetTransaction.class)
    public JAXBElement<String> createGetTransactionMerchantId(String value) {
        return new JAXBElement<String>(_GetLimitedTransacctionMerchantId_QNAME, String.class, GetTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "referenceNo", scope = GetTransaction.class)
    public JAXBElement<String> createGetTransactionReferenceNo(String value) {
        return new JAXBElement<String>(_GetTransactionReferenceNo_QNAME, String.class, GetTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "invoiceNo", scope = GetTransaction.class)
    public JAXBElement<String> createGetTransactionInvoiceNo(String value) {
        return new JAXBElement<String>(_GetLimitedTransacctionInvoiceNo_QNAME, String.class, GetTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getTransactionResult", scope = GetTransactionResponse.class)
    public JAXBElement<TransactionModel> createGetTransactionResponseGetTransactionResult(TransactionModel value) {
        return new JAXBElement<TransactionModel>(_GetTransactionResponseGetTransactionResult_QNAME, TransactionModel.class, GetTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "HCode", scope = CardModel.class)
    public JAXBElement<String> createCardModelHCode(String value) {
        return new JAXBElement<String>(_CardModelHCode_QNAME, String.class, CardModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VerifyPayment", name = "CardNo", scope = CardModel.class)
    public JAXBElement<String> createCardModelCardNo(String value) {
        return new JAXBElement<String>(_CardModelCardNo_QNAME, String.class, CardModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "merchantId", scope = KicccPaymentsVerification.class)
    public JAXBElement<String> createKicccPaymentsVerificationMerchantId(String value) {
        return new JAXBElement<String>(_GetLimitedTransacctionMerchantId_QNAME, String.class, KicccPaymentsVerification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "referenceNumber", scope = KicccPaymentsVerification.class)
    public JAXBElement<String> createKicccPaymentsVerificationReferenceNumber(String value) {
        return new JAXBElement<String>(_KicccPaymentsVerificationReferenceNumber_QNAME, String.class, KicccPaymentsVerification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sha1Key", scope = KicccPaymentsVerification.class)
    public JAXBElement<String> createKicccPaymentsVerificationSha1Key(String value) {
        return new JAXBElement<String>(_KicccPaymentsVerificationSha1Key_QNAME, String.class, KicccPaymentsVerification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = KicccPaymentsVerification.class)
    public JAXBElement<String> createKicccPaymentsVerificationToken(String value) {
        return new JAXBElement<String>(_KicccPaymentsVerificationToken_QNAME, String.class, KicccPaymentsVerification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOftransactionModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getTransactionByIbanResult", scope = GetTransactionByIbanResponse.class)
    public JAXBElement<ArrayOftransactionModel> createGetTransactionByIbanResponseGetTransactionByIbanResult(ArrayOftransactionModel value) {
        return new JAXBElement<ArrayOftransactionModel>(_GetTransactionByIbanResponseGetTransactionByIbanResult_QNAME, ArrayOftransactionModel.class, GetTransactionByIbanResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOftransactionModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getOfflineTransactionResult", scope = GetOfflineTransactionResponse.class)
    public JAXBElement<ArrayOftransactionModel> createGetOfflineTransactionResponseGetOfflineTransactionResult(ArrayOftransactionModel value) {
        return new JAXBElement<ArrayOftransactionModel>(_GetOfflineTransactionResponseGetOfflineTransactionResult_QNAME, ArrayOftransactionModel.class, GetOfflineTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "merchantId", scope = GetCardsPerKey.class)
    public JAXBElement<String> createGetCardsPerKeyMerchantId(String value) {
        return new JAXBElement<String>(_GetLimitedTransacctionMerchantId_QNAME, String.class, GetCardsPerKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "key", scope = GetCardsPerKey.class)
    public JAXBElement<String> createGetCardsPerKeyKey(String value) {
        return new JAXBElement<String>(_GetCardsPerKeyKey_QNAME, String.class, GetCardsPerKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fromDate", scope = GetOfflineTransaction.class)
    public JAXBElement<String> createGetOfflineTransactionFromDate(String value) {
        return new JAXBElement<String>(_GetTransactionByIbanFromDate_QNAME, String.class, GetOfflineTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "toDate", scope = GetOfflineTransaction.class)
    public JAXBElement<String> createGetOfflineTransactionToDate(String value) {
        return new JAXBElement<String>(_GetTransactionByIbanToDate_QNAME, String.class, GetOfflineTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "merchantId", scope = GetOfflineTransaction.class)
    public JAXBElement<String> createGetOfflineTransactionMerchantId(String value) {
        return new JAXBElement<String>(_GetLimitedTransacctionMerchantId_QNAME, String.class, GetOfflineTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "offset", scope = GetOfflineTransaction.class)
    public JAXBElement<String> createGetOfflineTransactionOffset(String value) {
        return new JAXBElement<String>(_GetDailyTransactionOffset_QNAME, String.class, GetOfflineTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "limit", scope = GetOfflineTransaction.class)
    public JAXBElement<String> createGetOfflineTransactionLimit(String value) {
        return new JAXBElement<String>(_GetDailyTransactionLimit_QNAME, String.class, GetOfflineTransaction.class, value);
    }

}
