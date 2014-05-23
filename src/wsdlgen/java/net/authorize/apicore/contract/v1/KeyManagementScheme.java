
package net.authorize.apicore.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyManagementScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyManagementScheme">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUKPT" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Operation" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}OperationType"/>
 *                   &lt;element name="Mode" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DeviceInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="EncryptedData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyManagementScheme", namespace = "AnetApi/xml/v1/schema/AnetApiSchema.xsd", propOrder = {
    "dukpt"
})
public class KeyManagementScheme {

    @XmlElement(name = "DUKPT")
    protected KeyManagementScheme.DUKPT dukpt;

    /**
     * Gets the value of the dukpt property.
     * 
     * @return
     *     possible object is
     *     {@link KeyManagementScheme.DUKPT }
     *     
     */
    public KeyManagementScheme.DUKPT getDUKPT() {
        return dukpt;
    }

    /**
     * Sets the value of the dukpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyManagementScheme.DUKPT }
     *     
     */
    public void setDUKPT(KeyManagementScheme.DUKPT value) {
        this.dukpt = value;
    }


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
     *         &lt;element name="Operation" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}OperationType"/>
     *         &lt;element name="Mode" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DeviceInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="EncryptedData" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "operation",
        "mode",
        "deviceInfo",
        "encryptedData"
    })
    public static class DUKPT {

        @XmlElement(name = "Operation", namespace = "AnetApi/xml/v1/schema/AnetApiSchema.xsd", required = true)
        @XmlSchemaType(name = "string")
        protected OperationType operation;
        @XmlElement(name = "Mode", namespace = "AnetApi/xml/v1/schema/AnetApiSchema.xsd")
        protected KeyManagementScheme.DUKPT.Mode mode;
        @XmlElement(name = "DeviceInfo", namespace = "AnetApi/xml/v1/schema/AnetApiSchema.xsd")
        protected KeyManagementScheme.DUKPT.DeviceInfo deviceInfo;
        @XmlElement(name = "EncryptedData", namespace = "AnetApi/xml/v1/schema/AnetApiSchema.xsd")
        protected KeyManagementScheme.DUKPT.EncryptedData encryptedData;

        /**
         * Gets the value of the operation property.
         * 
         * @return
         *     possible object is
         *     {@link OperationType }
         *     
         */
        public OperationType getOperation() {
            return operation;
        }

        /**
         * Sets the value of the operation property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperationType }
         *     
         */
        public void setOperation(OperationType value) {
            this.operation = value;
        }

        /**
         * Gets the value of the mode property.
         * 
         * @return
         *     possible object is
         *     {@link KeyManagementScheme.DUKPT.Mode }
         *     
         */
        public KeyManagementScheme.DUKPT.Mode getMode() {
            return mode;
        }

        /**
         * Sets the value of the mode property.
         * 
         * @param value
         *     allowed object is
         *     {@link KeyManagementScheme.DUKPT.Mode }
         *     
         */
        public void setMode(KeyManagementScheme.DUKPT.Mode value) {
            this.mode = value;
        }

        /**
         * Gets the value of the deviceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link KeyManagementScheme.DUKPT.DeviceInfo }
         *     
         */
        public KeyManagementScheme.DUKPT.DeviceInfo getDeviceInfo() {
            return deviceInfo;
        }

        /**
         * Sets the value of the deviceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link KeyManagementScheme.DUKPT.DeviceInfo }
         *     
         */
        public void setDeviceInfo(KeyManagementScheme.DUKPT.DeviceInfo value) {
            this.deviceInfo = value;
        }

        /**
         * Gets the value of the encryptedData property.
         * 
         * @return
         *     possible object is
         *     {@link KeyManagementScheme.DUKPT.EncryptedData }
         *     
         */
        public KeyManagementScheme.DUKPT.EncryptedData getEncryptedData() {
            return encryptedData;
        }

        /**
         * Sets the value of the encryptedData property.
         * 
         * @param value
         *     allowed object is
         *     {@link KeyManagementScheme.DUKPT.EncryptedData }
         *     
         */
        public void setEncryptedData(KeyManagementScheme.DUKPT.EncryptedData value) {
            this.encryptedData = value;
        }


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
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "description"
        })
        public static class DeviceInfo {

            @XmlElement(name = "Description", namespace = "AnetApi/xml/v1/schema/AnetApiSchema.xsd")
            protected String description;

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

        }


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
         *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "value"
        })
        public static class EncryptedData {

            @XmlElement(name = "Value", namespace = "AnetApi/xml/v1/schema/AnetApiSchema.xsd")
            protected String value;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }


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
         *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "pin",
            "data"
        })
        public static class Mode {

            @XmlElement(name = "PIN", namespace = "AnetApi/xml/v1/schema/AnetApiSchema.xsd")
            protected String pin;
            @XmlElement(name = "Data", namespace = "AnetApi/xml/v1/schema/AnetApiSchema.xsd")
            protected String data;

            /**
             * Gets the value of the pin property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPIN() {
                return pin;
            }

            /**
             * Sets the value of the pin property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPIN(String value) {
                this.pin = value;
            }

            /**
             * Gets the value of the data property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getData() {
                return data;
            }

            /**
             * Sets the value of the data property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setData(String value) {
                this.data = value;
            }

        }

    }

}
