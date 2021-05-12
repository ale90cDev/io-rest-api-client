package it.restapiclient.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class PrescriptionData {
    private String nre;
    private String iup;
    private String prescriber_fiscal_code;

    public String getNre() {
        return nre;
    }

    public void setNre(String nre) {
        this.nre = nre;
    }

    public String getIup() {
        return iup;
    }

    public void setIup(String iup) {
        this.iup = iup;
    }

    public String getPrescriber_fiscal_code() {
        return prescriber_fiscal_code;
    }

    public void setPrescriber_fiscal_code(String prescriber_fiscal_code) {
        this.prescriber_fiscal_code = prescriber_fiscal_code;
    }
}
