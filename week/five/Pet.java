package week.five;

public class Pet {
	private String NAME;
	private String SPECIES;
	private String BREED;
	private String COLOUR;
	private boolean vaccineStatus = false;
	private Client owner;
	private EmergVet vet;
	private CareProfile care;
	
	Pet(String name, String species, String breed, String colour, Client owner) {
		this.NAME = name;
		this.SPECIES = species;
		this.BREED = breed;
		this.COLOUR = colour;
		this.owner = owner;
	}
	
	public void setVet(EmergVet vet) {
		this.vet = vet;
	}
	
	public EmergVet getVet() {
		return this.vet;
	}
	
	public void updateVaccineStatus(boolean change) {
		this.vaccineStatus = change;
	}
	
	public boolean getVaccineStatus() {
		return this.vaccineStatus;
	}
	
	public void setCare(String[] meds, String medInstr, String feedingInstr) {
		this.care = new CareProfile(meds, medInstr, feedingInstr);
	}
	
	public String getCareSummary() {
		StringBuilder summary = new StringBuilder("Care for " + this.getName() + ":\n");
		summary.append(this.care.summarizeCareInstructions());
		String careSummary = summary.toString();
		
		return careSummary;
	}
	
	public Client getOwner() {
		return this.owner;
	}
	
	public void setOwner(Client updateOwner) {
		this.owner = updateOwner;
	}
	
	public String getName() {
		return this.NAME;
	}

	public String getSpecies() {
		return this.SPECIES;
	}
	
	public String getBreed() {
		return this.BREED;
	}
	
	public String getColour() {
		return this.COLOUR;
	}
}
