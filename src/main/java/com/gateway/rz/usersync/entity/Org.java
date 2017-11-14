package com.gateway.rz.usersync.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cent_SA_OPORG")
public class Org {

    @Id
    String SID;
    String SNAME;
    String SCODE;
    String SLONGNAME;
    String SORGKINDID;
    String SSEQUENCE;
    String SPARENT;
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

    public String getSLONGNAME() {
        return SLONGNAME;
    }

    public void setSLONGNAME(String SLONGNAME) {
        this.SLONGNAME = SLONGNAME;
    }

    public String getSORGKINDID() {
        return SORGKINDID;
    }

    public void setSORGKINDID(String SORGKINDID) {
        this.SORGKINDID = SORGKINDID;
    }

    public String getSSEQUENCE() {
        return SSEQUENCE;
    }

    public void setSSEQUENCE(String SSEQUENCE) {
        this.SSEQUENCE = SSEQUENCE;
    }

    public String getSPARENT() {
        return SPARENT;
    }

    public void setSPARENT(String SPARENT) {
        this.SPARENT = SPARENT;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }
}
