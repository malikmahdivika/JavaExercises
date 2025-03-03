package week.five;

public class Client {
	private String name;
	private String phoneNumber;
	private String address;
	private RewardsProfile rewardsInfo;
	
	public Client(String name, String phoneNumber, String address) {
		this.setName(name);
		this.setPhoneNumber(phoneNumber);
		this.setAddress(address);
		this.rewardsInfo = new RewardsProfile();
	}
	
	public boolean enrollRewards(String newNumber) {
		try {
			this.rewardsInfo = new RewardsProfile(newNumber);
			return true;
		} catch(InvalidRewardsNumException i) {
			System.out.println("Caught rewards number exception: " + i.getMessage());
			return false;
		}
	}
	
	public int getRewardsPoints() {
		return this.rewardsInfo.getPoints();
	}
	
	public String getRewardsNumber() {
		return this.rewardsInfo.getRewardsNum();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void updatePoints(int points) {
		this.rewardsInfo.setPoints(points);
	}
}
