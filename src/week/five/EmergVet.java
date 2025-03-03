package week.five;

public class EmergVet {
	private String name;
	private String phoneNum;
	
	public EmergVet(String name, String number) {
		this.name = name;
		this.phoneNum = number;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPhoneNum() {
		return this.phoneNum;
	}
}
