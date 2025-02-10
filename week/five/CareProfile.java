package week.five;

public class CareProfile {
	private String[] medList;
	private String medInstructions;
	private String feedingInstructions;
	
	public CareProfile(String[] medList, String meds, String feeding) {
		this.medList = medList;
		this.medInstructions= meds;
		this.feedingInstructions = feeding;
	}
	
	public String summarizeCareInstructions() {
		int counter = 1;
		StringBuilder instructions = new StringBuilder();
		
		for (String med : medList) {
			if (counter == medList.length) {
				instructions.append(med + "\n");
			} else {
				instructions.append(med + ", ");
			}
			counter++;
		}
		
		instructions.append(this.medInstructions);
		instructions.append("\n" + this.feedingInstructions);
		String summarizedInstructions = instructions.toString();
		
		return summarizedInstructions;
	}
}
