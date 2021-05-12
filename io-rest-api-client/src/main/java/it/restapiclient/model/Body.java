package it.restapiclient.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class Body {

    private int time_to_live = 3600;
    private Content content;
    private Address default_addresses;
    private String fiscal_code = null;

    public int getTime_to_live() {
        return time_to_live;
    }

    public void setTime_to_live(int time_to_live) {
        this.time_to_live = time_to_live;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Address getDefault_addresses() {
        return default_addresses;
    }

    public void setDefault_addresses(Address default_addresses) {
        this.default_addresses = default_addresses;
    }

    public String getFiscal_code() {
        return fiscal_code;
    }

    public void setFiscal_code(String fiscal_code) {
        this.fiscal_code = fiscal_code;
    }

    @Override
    public String toString() {
        return "Body{" +
                "time_to_live=" + time_to_live +
                ", content=" + content +
                ", default_addresses=" + default_addresses +
                ", fiscal_code='" + fiscal_code + '\'' +
                '}';
    }
}
