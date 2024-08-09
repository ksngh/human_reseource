package dto;

public class DeleteDTO {
    private String memberId;
    private String date;

    public DeleteDTO() {
    }

    public DeleteDTO(String memberId, String date) {
        this.memberId = memberId;
        this.date = date;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getDate() {
        return date;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
