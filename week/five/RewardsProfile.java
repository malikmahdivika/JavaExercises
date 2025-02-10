package week.five;
import java.util.regex.*;

public class RewardsProfile {
	private String rewardsNum = "Not enrolled";
	private int pointsTotal = 10;
	
	public RewardsProfile(String newNumber) throws InvalidRewardsNumException {
		Pattern validRewardsNum = Pattern.compile("^\\d{7}$");
		Matcher matchRewardsNum = validRewardsNum.matcher(newNumber);
		
		if (matchRewardsNum.find()) {
			this.rewardsNum = newNumber;
		} else if(!matchRewardsNum.find()) {
			throw new InvalidRewardsNumException();
		}
	}
	
	public RewardsProfile() {}
	
	public String getRewardsNum() {
		
		return this.rewardsNum;
	}
	
	public void setPoints(int addPoints) {
		this.pointsTotal += addPoints;
	}
	
	public int getPoints() {
		return this.pointsTotal;
	}
}
