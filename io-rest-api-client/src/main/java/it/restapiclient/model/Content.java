package it.restapiclient.model;


import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class Content {

    private String subject;
    private String markdown;
    private PaymentData payment_data;
    private PrescriptionData prescription_data;
    private Timestamp due_date;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMarkdown() {
        return markdown;
    }

    public void setMarkdown(String markdown) {
        this.markdown = markdown;
    }

    public PaymentData getPayment_data() {
        return payment_data;
    }

    public void setPayment_data(PaymentData payment_data) {
        this.payment_data = payment_data;
    }

    public PrescriptionData getPrescription_data() {
        return prescription_data;
    }

    public void setPrescription_data(PrescriptionData prescription_data) {
        this.prescription_data = prescription_data;
    }

    public Timestamp getDue_date() {
        return due_date;
    }

    public void setDue_date(Timestamp due_date) {
        this.due_date = due_date;
    }
}
