package week.five;
import java.util.ArrayList;

public class Employee {
	private String name;
	private String IDNUMBER;
	private String managerID;
	private ArrayList<Employee> supervisedEmployees;
	
	public Employee(String name, String idNumber) {
		this.setName(name);
		this.IDNUMBER = idNumber;
	}
	
	public Employee(String name, String idNumber, String managerID) {
		this.IDNUMBER = idNumber;
		this.setManagerID(managerID);
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getIDNumber() {
		return this.IDNUMBER;
	}

	public String getManagerID() {
		return managerID;
	}

	public void setManagerID(String managerID) {
		this.managerID = managerID;
	}
	
	public void addEmployee(Employee newEmployee) {
		if (this.supervisedEmployees == null) {
			this.supervisedEmployees = new ArrayList<Employee>();
			this.supervisedEmployees.add(newEmployee);
		} else {
			this.supervisedEmployees.add(newEmployee);
		}
	}
	
	public Employee[] getEmployees() {
		return (Employee[])this.supervisedEmployees.toArray();
	}
}
