package com.gateway.rz.usersync.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cent_SA_OPPERSON")
public class Person {

    @Id
    String SID;
	String SNAME;
	String SCODE;
	String SIDCARD;
	String SLOGINNAME;
	String SPASSWORD;
	String SMAINORGID;
	String SSEQUENCE;
	String SSEX;
	String SBIRTHDAY;
    String SCARDNO;
	String SCARDKIND;
	String SENGLISHNAME;
    String SSYSTEMCODE;
	String STATE;

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getSNAME() {
        return SNAME;
    }

    public void setSNAME(String SNAME) {
        this.SNAME = SNAME;
    }

    public String getSCODE() {
        return SCODE;
    }

    public void setSCODE(String SCODE) {
        this.SCODE = SCODE;
    }

    public String getSIDCARD() {
        return SIDCARD;
    }

    public void setSIDCARD(String SIDCARD) {
        this.SIDCARD = SIDCARD;
    }

    public String getSLOGINNAME() {
        return SLOGINNAME;
    }

    public void setSLOGINNAME(String SLOGINNAME) {
        this.SLOGINNAME = SLOGINNAME;
    }

    public String getSPASSWORD() {
        return SPASSWORD;
    }

    public void setSPASSWORD(String SPASSWORD) {
        this.SPASSWORD = SPASSWORD;
    }

    public String getSMAINORGID() {
        return SMAINORGID;
    }

    public void setSMAINORGID(String SMAINORGID) {
        this.SMAINORGID = SMAINORGID;
    }

    public String getSSEQUENCE() {
        return SSEQUENCE;
    }

    public void setSSEQUENCE(String SSEQUENCE) {
        this.SSEQUENCE = SSEQUENCE;
    }

    public String getSSEX() {
        return SSEX;
    }

    public void setSSEX(String SSEX) {
        this.SSEX = SSEX;
    }

    public String getSBIRTHDAY() {
        return SBIRTHDAY;
    }

    public void setSBIRTHDAY(String SBIRTHDAY) {
        this.SBIRTHDAY = SBIRTHDAY;
    }

    public String getSCARDNO() {
        return SCARDNO;
    }

    public void setSCARDNO(String SCARDNO) {
        this.SCARDNO = SCARDNO;
    }

    public String getSCARDKIND() {
        return SCARDKIND;
    }

    public void setSCARDKIND(String SCARDKIND) {
        this.SCARDKIND = SCARDKIND;
    }

    public String getSENGLISHNAME() {
        return SENGLISHNAME;
    }

    public void setSENGLISHNAME(String SENGLISHNAME) {
        this.SENGLISHNAME = SENGLISHNAME;
    }

    public String getSSYSTEMCODE() {
        return SSYSTEMCODE;
    }

    public void setSSYSTEMCODE(String SSYSTEMCODE) {
        this.SSYSTEMCODE = SSYSTEMCODE;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }
}
