package test;

public class ContactRe {

	private String name;
	private String phone;
	private String email;
	private String address;
	private String birthday;
	private String group;
	
	public ContactRe(String name, String phone, String email, 
			String address, String birthday, String group) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	
	public void printData() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + name);
		System.out.println("이메일 : " + name);
		System.out.println("주소 : " + name);
		System.out.println("생일 : " + name);
		System.out.println("그룹 : " + name);
	}
	
	
}
