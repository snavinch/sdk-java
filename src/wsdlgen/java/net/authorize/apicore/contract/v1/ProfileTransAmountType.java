
package net.authorize.apicore.contract.v1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profileTransAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profileTransAmountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="tax" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}extendedAmountType" minOccurs="0"/>
 *         &lt;element name="shipping" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}extendedAmountType" minOccurs="0"/>
 *         &lt;element name="duty" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}extendedAmountType" minOccurs="0"/>
 *         &lt;element name="lineItems" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}lineItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profileTransAmountType", namespace = "AnetApi/xml/v1/schema/AnetApiSchema.xsd", propOrder = {
    "amount",
    "tax",
    "shipping",
    "duty",
    "lineItems"
})
@XmlSeeAlso({
    ProfileTransPriorAuthCaptureType.class,
    ProfileTransRefundType.class,
    ProfileTransOrderType.class
})
public class ProfileTransAmountType {

    @XmlElement(required = true)
    protected BigDecimal amount;
    protected ExtendedAmountType tax;
    protected ExtendedAmountType shipping;
    protected ExtendedAmountType duty;
    protected List<LineItemType> lineItems;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedAmountType }
     *     
     */
    public ExtendedAmountType getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedAmountType }
     *     
     */
    public void setTax(ExtendedAmountType value) {
        this.tax = value;
    }

    /**
     * Gets the value of the shipping property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedAmountType }
     *     
     */
    public ExtendedAmountType getShipping() {
        return shipping;
    }

    /**
     * Sets the value of the shipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedAmountType }
     *     
     */
    public void setShipping(ExtendedAmountType value) {
        this.shipping = value;
    }

    /**
     * Gets the value of the duty property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedAmountType }
     *     
     */
    public ExtendedAmountType getDuty() {
        return duty;
    }

    /**
     * Sets the value of the duty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedAmountType }
     *     
     */
    public void setDuty(ExtendedAmountType value) {
        this.duty = value;
    }

    /**
     * Gets the value of the lineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemType }
     * 
     * 
     */
    public List<LineItemType> getLineItems() {
        if (lineItems == null) {
            lineItems = new ArrayList<LineItemType>();
        }
        return this.lineItems;
    }

}
