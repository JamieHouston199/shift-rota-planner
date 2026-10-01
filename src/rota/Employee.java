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
