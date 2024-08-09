package dto;

public class UpdateDTO {
    private String memeberId;
    private String date;
    private String status;

    public UpdateDTO(String memeberId, String date, String status) {
        this.memeberId = memeberId;
        this.date = date;
        this.status = status;
    }

    public String getMemeberId() {
        return memeberId;
    }

    public void setMemeberId(String memeberId) {
        this.memeberId = memeberId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
