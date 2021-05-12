package it.restapiclient.model;

public class Response {
    private String id;

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Response{" +
                "id='" + id + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }
}
