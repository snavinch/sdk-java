
package net.authorize.apicore.contract.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerProfileMaskedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerProfileMaskedType">
 *   &lt;complexContent>
 *     &lt;extension base="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}customerProfileExType">
 *       &lt;sequence>
 *         &lt;element name="paymentProfiles" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}customerPaymentProfileMaskedType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shipToList" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}customerAddressExType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerProfileMaskedType", namespace = "AnetApi/xml/v1/schema/AnetApiSchema.xsd", propOrder = {
    "paymentProfiles",
    "shipToList"
})
public class CustomerProfileMaskedType
    extends CustomerProfileExType
{

    protected List<CustomerPaymentProfileMaskedType> paymentProfiles;
    protected List<CustomerAddressExType> shipToList;

    /**
     * Gets the value of the paymentProfiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentProfiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentProfiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerPaymentProfileMaskedType }
     * 
     * 
     */
    public List<CustomerPaymentProfileMaskedType> getPaymentProfiles() {
        if (paymentProfiles == null) {
            paymentProfiles = new ArrayList<CustomerPaymentProfileMaskedType>();
        }
        return this.paymentProfiles;
    }

    /**
     * Gets the value of the shipToList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipToList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipToList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerAddressExType }
     * 
     * 
     */
    public List<CustomerAddressExType> getShipToList() {
        if (shipToList == null) {
            shipToList = new ArrayList<CustomerAddressExType>();
        }
        return this.shipToList;
    }

}
