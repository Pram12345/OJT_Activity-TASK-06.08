package in.sp.bean;

public class userController {
	private String name;
	private String mail;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "userController [name=" + name + ", mail=" + mail + ", phone=" + phone + "]";
	}
	

}
