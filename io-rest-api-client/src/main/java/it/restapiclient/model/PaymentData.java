package it.restapiclient.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class PaymentData {

    private String amount;
    private String notice_number;
    private Boolean invalid_after_due_date;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getNotice_number() {
        return notice_number;
    }

    public void setNotice_number(String notice_number) {
        this.notice_number = notice_number;
    }

    public Boolean getInvalid_after_due_date() {
        return invalid_after_due_date;
    }

    public void setInvalid_after_due_date(Boolean invalid_after_due_date) {
        this.invalid_after_due_date = invalid_after_due_date;
    }
}
