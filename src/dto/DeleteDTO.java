package dto;

public class DeleteDTO {
    private String memeberId;
    private String date;

    public DeleteDTO(String memeberId, String date) {
        this.memeberId = memeberId;
        this.date = date;
    }

    public String getMemeberId() {
        return memeberId;
    }

    public String getDate() {
        return date;
    }
}
