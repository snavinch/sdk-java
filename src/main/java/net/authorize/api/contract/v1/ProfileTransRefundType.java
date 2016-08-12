//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 11:22:30 PM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profileTransRefundType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profileTransRefundType">
 *   &lt;complexContent>
 *     &lt;extension base="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}profileTransAmountType">
 *       &lt;sequence>
 *         &lt;element name="customerProfileId" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}numericString" minOccurs="0"/>
 *         &lt;element name="customerPaymentProfileId" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}numericString" minOccurs="0"/>
 *         &lt;element name="customerShippingAddressId" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}numericString" minOccurs="0"/>
 *         &lt;element name="creditCardNumberMasked" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="8"/>
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bankRoutingNumberMasked" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="8"/>
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bankAccountNumberMasked" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="8"/>
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="order" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}orderExType" minOccurs="0"/>
 *         &lt;element name="transId" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}numericString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profileTransRefundType", propOrder = {
    "customerProfileId",
    "customerPaymentProfileId",
    "customerShippingAddressId",
    "creditCardNumberMasked",
    "bankRoutingNumberMasked",
    "bankAccountNumberMasked",
    "order",
    "transId"
})
public class ProfileTransRefundType
    extends ProfileTransAmountType
{

    protected String customerProfileId;
    protected String customerPaymentProfileId;
    protected String customerShippingAddressId;
    protected String creditCardNumberMasked;
    protected String bankRoutingNumberMasked;
    protected String bankAccountNumberMasked;
    protected OrderExType order;
    protected String transId;

    /**
     * Gets the value of the customerProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerProfileId() {
        return customerProfileId;
    }

    /**
     * Sets the value of the customerProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerProfileId(String value) {
        this.customerProfileId = value;
    }

    /**
     * Gets the value of the customerPaymentProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPaymentProfileId() {
        return customerPaymentProfileId;
    }

    /**
     * Sets the value of the customerPaymentProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPaymentProfileId(String value) {
        this.customerPaymentProfileId = value;
    }

    /**
     * Gets the value of the customerShippingAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerShippingAddressId() {
        return customerShippingAddressId;
    }

    /**
     * Sets the value of the customerShippingAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerShippingAddressId(String value) {
        this.customerShippingAddressId = value;
    }

    /**
     * Gets the value of the creditCardNumberMasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumberMasked() {
        return creditCardNumberMasked;
    }

    /**
     * Sets the value of the creditCardNumberMasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumberMasked(String value) {
        this.creditCardNumberMasked = value;
    }

    /**
     * Gets the value of the bankRoutingNumberMasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankRoutingNumberMasked() {
        return bankRoutingNumberMasked;
    }

    /**
     * Sets the value of the bankRoutingNumberMasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankRoutingNumberMasked(String value) {
        this.bankRoutingNumberMasked = value;
    }

    /**
     * Gets the value of the bankAccountNumberMasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNumberMasked() {
        return bankAccountNumberMasked;
    }

    /**
     * Sets the value of the bankAccountNumberMasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNumberMasked(String value) {
        this.bankAccountNumberMasked = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link OrderExType }
     *     
     */
    public OrderExType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderExType }
     *     
     */
    public void setOrder(OrderExType value) {
        this.order = value;
    }

    /**
     * Gets the value of the transId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransId() {
        return transId;
    }

    /**
     * Sets the value of the transId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransId(String value) {
        this.transId = value;
    }

}
