package dto;

public class UpdateDTO {

    private String memberId;
    private String date;
    private String status;

    public UpdateDTO() {
    }

    public UpdateDTO(String memberId, String date, String status) {
        this.memberId = memberId;
        this.date = date;
        this.status = status;
    }

    public String getMemeberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
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
