package jp.co.tis.tiscon4.form;

import nablarch.core.validation.ee.Required;

import javax.validation.constraints.AssertTrue;
import java.io.Serializable;

public class AcceptForm implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 加入条件の同意確認 */
    @Required
    private String acceptance;

    private String insuranceType;

    private String lady;

    @AssertTrue(message = "ダメです！")
    public boolean isValid() {
        if (insuranceType.equals("treatLady")) {
            return lady != null;
        }
        return true;
    }

    public String getAcceptance() {
        return acceptance;
    }

    public void setAcceptance(String acceptance) {
        this.acceptance = acceptance;
    }

    public String getLady() {
        return lady;
    }

    public void setLady(String lady) {
        this.lady = lady;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }
}
