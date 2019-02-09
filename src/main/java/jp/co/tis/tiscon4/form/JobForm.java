package jp.co.tis.tiscon4.form;

import nablarch.core.validation.ee.Domain;
import nablarch.core.validation.ee.Required;

import java.io.Serializable;

public class JobForm implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 勤務先 */
    @Required
    @Domain("employerName")
    private String employerName;

    /** 勤務先郵便番号 */
    @Required
    @Domain("employerZipCode")
    private String employerZipCode;

    /** 勤務先住所 */
    @Required
    @Domain("employerAddress")
    private String employerAddress;

    /** 勤務先電話番号 */
    @Required
    @Domain("employerPhoneNumber")
    private String employerPhoneNumber;

    /** 業種 */
    @Required
    @Domain("industryType")
    private String industryType;

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployerZipCode() {
        return employerZipCode;
    }

    public void setEmployerZipCode(String employerZipCode) {
        this.employerZipCode = employerZipCode;
    }

    public String getEmployerAddress() {
        return employerAddress;
    }

    public void setEmployerAddress(String employerAddress) {
        this.employerAddress = employerAddress;
    }

    public String getEmployerPhoneNumber() {
        return employerPhoneNumber;
    }

    public void setEmployerPhoneNumber(String employerPhoneNumber) {
        this.employerPhoneNumber = employerPhoneNumber;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }
}
