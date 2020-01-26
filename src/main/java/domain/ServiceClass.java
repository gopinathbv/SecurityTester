package domain;

public class ServiceClass {
    private String id;

    private String payload;

    public ServiceClass(String id, String payload) {
        this.id = id;
        this.payload = payload;
    }

    public String getId() {
        return id;
    }

    public String getPayload() {
        return payload;
    }

}
