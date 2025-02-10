package week.five;

public class Booking {
	private String STARTDATE;
	private String ENDDATE;
	private Pet BOOKEDPET;
	private Employee CAREGIVER;
	
	public Booking(Pet pet, Employee assigned, String startDate, String endDate) {
		this.BOOKEDPET = pet;
		this.CAREGIVER = assigned;
		this.STARTDATE = startDate;
		this.ENDDATE = endDate;
	}

	public String getStartDate() {
		return STARTDATE;
	}

	public String getEndDate() {
		return ENDDATE;
	}

	public Pet getBookedPet() {
		return BOOKEDPET;
	}


	public Employee getCaregiver() {
		return CAREGIVER;
	}
}
