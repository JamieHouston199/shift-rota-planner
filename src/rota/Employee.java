package rota;

public class Employee {
	private String name;
	private double targetHours;
	private Availability availability;
	
	public Employee(String name, double targetHours, Availability availability) {
		this.name=name;
		this.targetHours=targetHours;
		this.availability=availability;
	}
	/**
	 * A method to check if the employee is able to work a shift
	 * @param shift refers to the shift being checked
	 * @return true if the employee can work the shift, returns false if not
	 */
	public boolean canWork(Shift shift) {
		if(this.availability==Availability.BOTH) {
			return true;
		}else if(shift.isWeekend()) {
			return this.availability==Availability.WEEKENDS;
		}else {
			return this.availability==Availability.WEEKDAYS;
		}
	}
	
	public String getName() {
		return name;
	}
	public double getTargetHours() {
		return targetHours;
	}
	public Availability getAvailability() {
		return availability;
		
	}
	@Override
	public String toString() {
		return name + "("+ targetHours + "h, "+ availability+ ")";
	}
}
