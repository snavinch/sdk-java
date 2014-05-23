
package net.authorize.apicore.contract.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ARBSubscriptionReportOrderFieldEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ARBSubscriptionReportOrderFieldEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Id"/>
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="Status"/>
 *     &lt;enumeration value="CreateTime"/>
 *     &lt;enumeration value="BillToLastName"/>
 *     &lt;enumeration value="BillToFirstName"/>
 *     &lt;enumeration value="CardNumber_AccountNumber"/>
 *     &lt;enumeration value="Amount"/>
 *     &lt;enumeration value="NumRecurred"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ARBSubscriptionReportOrderFieldEnum")
@XmlEnum
public enum ARBSubscriptionReportOrderFieldEnum {

    @XmlEnumValue("Id")
    ID("Id"),
    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("CreateTime")
    CREATE_TIME("CreateTime"),
    @XmlEnumValue("BillToLastName")
    BILL_TO_LAST_NAME("BillToLastName"),
    @XmlEnumValue("BillToFirstName")
    BILL_TO_FIRST_NAME("BillToFirstName"),
    @XmlEnumValue("CardNumber_AccountNumber")
    CARD_NUMBER_ACCOUNT_NUMBER("CardNumber_AccountNumber"),
    @XmlEnumValue("Amount")
    AMOUNT("Amount"),
    @XmlEnumValue("NumRecurred")
    NUM_RECURRED("NumRecurred");
    private final String value;

    ARBSubscriptionReportOrderFieldEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ARBSubscriptionReportOrderFieldEnum fromValue(String v) {
        for (ARBSubscriptionReportOrderFieldEnum c: ARBSubscriptionReportOrderFieldEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
