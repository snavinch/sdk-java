
package net.authorize.apicore.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Encoding" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}EncodingType"/>
 *         &lt;element name="EncryptionAlgorithm" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}EncryptionAlgorithmType"/>
 *         &lt;element name="Scheme" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}KeyManagementScheme" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValue", namespace = "AnetApi/xml/v1/schema/AnetApiSchema.xsd", propOrder = {
    "encoding",
    "encryptionAlgorithm",
    "scheme"
})
public class KeyValue {

    @XmlElement(name = "Encoding", required = true)
    @XmlSchemaType(name = "string")
    protected EncodingType encoding;
    @XmlElement(name = "EncryptionAlgorithm", required = true)
    @XmlSchemaType(name = "string")
    protected EncryptionAlgorithmType encryptionAlgorithm;
    @XmlElement(name = "Scheme")
    protected KeyManagementScheme scheme;

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link EncodingType }
     *     
     */
    public EncodingType getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncodingType }
     *     
     */
    public void setEncoding(EncodingType value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the encryptionAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionAlgorithmType }
     *     
     */
    public EncryptionAlgorithmType getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    /**
     * Sets the value of the encryptionAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionAlgorithmType }
     *     
     */
    public void setEncryptionAlgorithm(EncryptionAlgorithmType value) {
        this.encryptionAlgorithm = value;
    }

    /**
     * Gets the value of the scheme property.
     * 
     * @return
     *     possible object is
     *     {@link KeyManagementScheme }
     *     
     */
    public KeyManagementScheme getScheme() {
        return scheme;
    }

    /**
     * Sets the value of the scheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyManagementScheme }
     *     
     */
    public void setScheme(KeyManagementScheme value) {
        this.scheme = value;
    }

}
