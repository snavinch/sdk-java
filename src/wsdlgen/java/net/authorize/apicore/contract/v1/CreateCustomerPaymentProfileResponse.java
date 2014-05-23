
package net.authorize.apicore.contract.v1;

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
 *         &lt;element name="CreateCustomerPaymentProfileResult" type="{http://api.authorize.net/ANetApiWS/}CustomerPaymentProfileResponseData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "createCustomerPaymentProfileResult"
})
@XmlRootElement(name = "CreateCustomerPaymentProfileResponse")
public class CreateCustomerPaymentProfileResponse {

    @XmlElement(name = "CreateCustomerPaymentProfileResult")
    protected CustomerPaymentProfileResponseData createCustomerPaymentProfileResult;

    /**
     * Gets the value of the createCustomerPaymentProfileResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPaymentProfileResponseData }
     *     
     */
    public CustomerPaymentProfileResponseData getCreateCustomerPaymentProfileResult() {
        return createCustomerPaymentProfileResult;
    }

    /**
     * Sets the value of the createCustomerPaymentProfileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPaymentProfileResponseData }
     *     
     */
    public void setCreateCustomerPaymentProfileResult(CustomerPaymentProfileResponseData value) {
        this.createCustomerPaymentProfileResult = value;
    }

}
