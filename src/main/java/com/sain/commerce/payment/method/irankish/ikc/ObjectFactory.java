
package com.sain.commerce.payment.method.irankish.ikc;

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
 * generated in the com.sain.commerce.payment.method.irankish.ikc package.
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
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _TokenResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Token", "tokenResponse");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _MakeTokenResponseMakeTokenResult_QNAME = new QName("http://tempuri.org/", "MakeTokenResult");
    private final static QName _MakeTokenSpecialPaymentId_QNAME = new QName("http://tempuri.org/", "specialPaymentId");
    private final static QName _MakeTokenAmount_QNAME = new QName("http://tempuri.org/", "amount");
    private final static QName _MakeTokenPaymentId_QNAME = new QName("http://tempuri.org/", "paymentId");
    private final static QName _MakeTokenMerchantId_QNAME = new QName("http://tempuri.org/", "merchantId");
    private final static QName _MakeTokenDescription_QNAME = new QName("http://tempuri.org/", "description");
    private final static QName _MakeTokenRevertURL_QNAME = new QName("http://tempuri.org/", "revertURL");
    private final static QName _MakeTokenInvoiceNo_QNAME = new QName("http://tempuri.org/", "invoiceNo");
    private final static QName _MakeSpecialTokenExtraParam4_QNAME = new QName("http://tempuri.org/", "extraParam4");
    private final static QName _MakeSpecialTokenExtraParam3_QNAME = new QName("http://tempuri.org/", "extraParam3");
    private final static QName _MakeSpecialTokenExtraParam2_QNAME = new QName("http://tempuri.org/", "extraParam2");
    private final static QName _MakeSpecialTokenExtraParam1_QNAME = new QName("http://tempuri.org/", "extraParam1");
    private final static QName _TokenResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Token", "message");
    private final static QName _TokenResponseToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Token", "token");
    private final static QName _MakeSpecialTokenResponseMakeSpecialTokenResult_QNAME = new QName("http://tempuri.org/", "MakeSpecialTokenResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sain.commerce.payment.method.irankish.ikc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TokenResponse }
     * 
     */
    public TokenResponse createTokenResponse() {
        return new TokenResponse();
    }

    /**
     * Create an instance of {@link MakeToken }
     * 
     */
    public MakeToken createMakeToken() {
        return new MakeToken();
    }

    /**
     * Create an instance of {@link MakeSpecialTokenResponse }
     * 
     */
    public MakeSpecialTokenResponse createMakeSpecialTokenResponse() {
        return new MakeSpecialTokenResponse();
    }

    /**
     * Create an instance of {@link MakeSpecialToken }
     * 
     */
    public MakeSpecialToken createMakeSpecialToken() {
        return new MakeSpecialToken();
    }

    /**
     * Create an instance of {@link MakeTokenResponse }
     * 
     */
    public MakeTokenResponse createMakeTokenResponse() {
        return new MakeTokenResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Token", name = "tokenResponse")
    public JAXBElement<TokenResponse> createTokenResponse(TokenResponse value) {
        return new JAXBElement<TokenResponse>(_TokenResponse_QNAME, TokenResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MakeTokenResult", scope = MakeTokenResponse.class)
    public JAXBElement<TokenResponse> createMakeTokenResponseMakeTokenResult(TokenResponse value) {
        return new JAXBElement<TokenResponse>(_MakeTokenResponseMakeTokenResult_QNAME, TokenResponse.class, MakeTokenResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "specialPaymentId", scope = MakeToken.class)
    public JAXBElement<String> createMakeTokenSpecialPaymentId(String value) {
        return new JAXBElement<String>(_MakeTokenSpecialPaymentId_QNAME, String.class, MakeToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "amount", scope = MakeToken.class)
    public JAXBElement<String> createMakeTokenAmount(String value) {
        return new JAXBElement<String>(_MakeTokenAmount_QNAME, String.class, MakeToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "paymentId", scope = MakeToken.class)
    public JAXBElement<String> createMakeTokenPaymentId(String value) {
        return new JAXBElement<String>(_MakeTokenPaymentId_QNAME, String.class, MakeToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "merchantId", scope = MakeToken.class)
    public JAXBElement<String> createMakeTokenMerchantId(String value) {
        return new JAXBElement<String>(_MakeTokenMerchantId_QNAME, String.class, MakeToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "description", scope = MakeToken.class)
    public JAXBElement<String> createMakeTokenDescription(String value) {
        return new JAXBElement<String>(_MakeTokenDescription_QNAME, String.class, MakeToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "revertURL", scope = MakeToken.class)
    public JAXBElement<String> createMakeTokenRevertURL(String value) {
        return new JAXBElement<String>(_MakeTokenRevertURL_QNAME, String.class, MakeToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "invoiceNo", scope = MakeToken.class)
    public JAXBElement<String> createMakeTokenInvoiceNo(String value) {
        return new JAXBElement<String>(_MakeTokenInvoiceNo_QNAME, String.class, MakeToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "specialPaymentId", scope = MakeSpecialToken.class)
    public JAXBElement<String> createMakeSpecialTokenSpecialPaymentId(String value) {
        return new JAXBElement<String>(_MakeTokenSpecialPaymentId_QNAME, String.class, MakeSpecialToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "amount", scope = MakeSpecialToken.class)
    public JAXBElement<String> createMakeSpecialTokenAmount(String value) {
        return new JAXBElement<String>(_MakeTokenAmount_QNAME, String.class, MakeSpecialToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "paymentId", scope = MakeSpecialToken.class)
    public JAXBElement<String> createMakeSpecialTokenPaymentId(String value) {
        return new JAXBElement<String>(_MakeTokenPaymentId_QNAME, String.class, MakeSpecialToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "merchantId", scope = MakeSpecialToken.class)
    public JAXBElement<String> createMakeSpecialTokenMerchantId(String value) {
        return new JAXBElement<String>(_MakeTokenMerchantId_QNAME, String.class, MakeSpecialToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "extraParam4", scope = MakeSpecialToken.class)
    public JAXBElement<String> createMakeSpecialTokenExtraParam4(String value) {
        return new JAXBElement<String>(_MakeSpecialTokenExtraParam4_QNAME, String.class, MakeSpecialToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "extraParam3", scope = MakeSpecialToken.class)
    public JAXBElement<String> createMakeSpecialTokenExtraParam3(String value) {
        return new JAXBElement<String>(_MakeSpecialTokenExtraParam3_QNAME, String.class, MakeSpecialToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "description", scope = MakeSpecialToken.class)
    public JAXBElement<String> createMakeSpecialTokenDescription(String value) {
        return new JAXBElement<String>(_MakeTokenDescription_QNAME, String.class, MakeSpecialToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "extraParam2", scope = MakeSpecialToken.class)
    public JAXBElement<String> createMakeSpecialTokenExtraParam2(String value) {
        return new JAXBElement<String>(_MakeSpecialTokenExtraParam2_QNAME, String.class, MakeSpecialToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "extraParam1", scope = MakeSpecialToken.class)
    public JAXBElement<String> createMakeSpecialTokenExtraParam1(String value) {
        return new JAXBElement<String>(_MakeSpecialTokenExtraParam1_QNAME, String.class, MakeSpecialToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "revertURL", scope = MakeSpecialToken.class)
    public JAXBElement<String> createMakeSpecialTokenRevertURL(String value) {
        return new JAXBElement<String>(_MakeTokenRevertURL_QNAME, String.class, MakeSpecialToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "invoiceNo", scope = MakeSpecialToken.class)
    public JAXBElement<String> createMakeSpecialTokenInvoiceNo(String value) {
        return new JAXBElement<String>(_MakeTokenInvoiceNo_QNAME, String.class, MakeSpecialToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Token", name = "message", scope = TokenResponse.class)
    public JAXBElement<String> createTokenResponseMessage(String value) {
        return new JAXBElement<String>(_TokenResponseMessage_QNAME, String.class, TokenResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Token", name = "token", scope = TokenResponse.class)
    public JAXBElement<String> createTokenResponseToken(String value) {
        return new JAXBElement<String>(_TokenResponseToken_QNAME, String.class, TokenResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MakeSpecialTokenResult", scope = MakeSpecialTokenResponse.class)
    public JAXBElement<TokenResponse> createMakeSpecialTokenResponseMakeSpecialTokenResult(TokenResponse value) {
        return new JAXBElement<TokenResponse>(_MakeSpecialTokenResponseMakeSpecialTokenResult_QNAME, TokenResponse.class, MakeSpecialTokenResponse.class, value);
    }

}
