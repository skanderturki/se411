package psu.edu.se411.ch04.accountsPayable.model;

public abstract class Employee implements Payable {

	private String id;
	private String fname;
	private String lname;
	
	public Employee(String id_p, String fname_p, String lname_p) {
		this.id = id_p;
		this.fname = fname_p;
		this.lname = lname_p;
	}
	
	/** Abstract method should be implemented by sub-classes */
	public abstract Double earnings();
	
	public Double getPaymentAmount() {
		return earnings();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s%nEmployee id: %s", getFname(), getLname(), getId());
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
}
