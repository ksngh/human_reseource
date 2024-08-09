package dto;

import java.util.Map;

public class MemberDTO {

	String id;
	Map<String,String> dateStatus;

	public MemberDTO(String id, Map<String, String> dateStatus) {
		this.id = id;
		this.dateStatus = dateStatus;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<String, String> getDateStatus() {
		return dateStatus;
	}

	public void setDateStatus(Map<String, String> dateStatus) {
		this.dateStatus = dateStatus;
	}
}
