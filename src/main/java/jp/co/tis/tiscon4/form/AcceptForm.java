package jp.co.tis.tiscon4.form;

import nablarch.core.validation.ee.Required;

import java.io.Serializable;

public class AcceptForm implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 加入条件の同意確認 */
    @Required
    private String acceptance;

    @Required
    private String lady;

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
}
