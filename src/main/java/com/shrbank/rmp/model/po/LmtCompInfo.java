package com.shrbank.rmp.model.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * (LmtCompInfo)实体类
 *
 * @author makejava
 * @since 2021-01-22 12:51:57
 */
public class LmtCompInfo implements Serializable {
    private static final long serialVersionUID = 103360042504933482L;
    /**
     * 客户额度编号
     */
    private String lmtCompNo;
    /**
     * 客户编号
     */
    private String cusId;
    /**
     * 证件号码
     */
    private String certCode;
    /**
     * 证件类型
     */
    private String certType;
    /**
     * 客户名称
     */
    private String cusName;
    /**
     * 授信合同号
     */
    private String crdContNo;
    /**
     * 授信类型
     */
    private String crdType;
    /**
     * 额度
     */
    private BigDecimal amt;
    /**
     * 录入日期
     */
    private Date inputDate;
    /**
     * 录入时间
     */
    private Date inputTime;
    /**
     * 最后更新日期
     */
    private Date lastUpdateDate;
    /**
     * 最后更新时间
     */
    private Date lastUpdateTime;
    /**
     * 登记人id
     */
    private String inputId;
    /**
     * 登记人所属部门
     */
    private String inputBrId;
    /**
     * 额度状态
     */
    private String lmtStatus;
    /**
     * 备用字段1
     */
    private String field1;
    /**
     * 备用字段2
     */
    private String field2;
    /**
     * 备用字段3
     */
    private String field3;
    /**
     * 备用字段4
     */
    private String field4;
    /**
     * 备用字段5
     */
    private String field5;
    /**
     * 备用字段6
     */
    private String field6;
    /**
     * 备用字段7
     */
    private String field7;
    /**
     * 备用字段8
     */
    private String field8;
    /**
     * 备用字段9
     */
    private String field9;
    /**
     * 备用字段10
     */
    private String field10;


    public String getLmtCompNo() {
        return lmtCompNo;
    }

    public void setLmtCompNo(String lmtCompNo) {
        this.lmtCompNo = lmtCompNo;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getCertCode() {
        return certCode;
    }

    public void setCertCode(String certCode) {
        this.certCode = certCode;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCrdContNo() {
        return crdContNo;
    }

    public void setCrdContNo(String crdContNo) {
        this.crdContNo = crdContNo;
    }

    public String getCrdType() {
        return crdType;
    }

    public void setCrdType(String crdType) {
        this.crdType = crdType;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getInputId() {
        return inputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    public String getInputBrId() {
        return inputBrId;
    }

    public void setInputBrId(String inputBrId) {
        this.inputBrId = inputBrId;
    }

    public String getLmtStatus() {
        return lmtStatus;
    }

    public void setLmtStatus(String lmtStatus) {
        this.lmtStatus = lmtStatus;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }

    public String getField6() {
        return field6;
    }

    public void setField6(String field6) {
        this.field6 = field6;
    }

    public String getField7() {
        return field7;
    }

    public void setField7(String field7) {
        this.field7 = field7;
    }

    public String getField8() {
        return field8;
    }

    public void setField8(String field8) {
        this.field8 = field8;
    }

    public String getField9() {
        return field9;
    }

    public void setField9(String field9) {
        this.field9 = field9;
    }

    public String getField10() {
        return field10;
    }

    public void setField10(String field10) {
        this.field10 = field10;
    }

}