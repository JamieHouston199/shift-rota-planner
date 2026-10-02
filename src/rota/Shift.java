package rota;

public class Shift {
	private String day;
	private String start;
	private String end;
	private double hours;
	private boolean weekend;
	private Employee assignedTo;
	
	public Shift(String day,String start,String end, double hours,boolean weekend) {
		this.day=day;
		this.start=start;
		this.end=end;
		this.hours=hours;
		this.weekend=weekend;
	}
	public void setAssignedTo(Employee employee) {
		this.assignedTo=employee;
	}
	public Employee getAssignedTo() {
		return this.assignedTo;
	}
	
	public String getDay() {
		return day;
	}
	public double getHours() {
		return hours;
	}
	public boolean isWeekend() {
		return weekend;
	}
	/**
	 * A toString method to display the shift and who is working it in the console
	 */
	@Override
	public String toString() {
	String worker;
	if(this.assignedTo==null) {
		worker = "UNFILLED";
	}else {
		worker = this.assignedTo.getName();
	}
	return this.day + " | " +this.start + "-"+this.end+" | "+this.hours+"h | "+ worker;
	}

}
