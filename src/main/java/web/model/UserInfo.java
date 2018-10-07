package web.model;

import java.util.Date;

public class UserInfo {
	
	private Integer userId;
	private String userName;
	private String password;
	private String email;
	private Integer gender;
	private Boolean active;
	private Date datetime;
	
	public UserInfo() {
		
	}
	
	public UserInfo( Integer userId, String userName, String password, String email, Integer gender, Boolean active, Date datetime) {
		this.userName = userName;
		this.password = password;
		this.userId = userId;
		this.email = email;
		this.gender = gender;
		this.active = active;
		this.datetime = datetime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	
	
}
