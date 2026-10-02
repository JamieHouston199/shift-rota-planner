package rota;

import java.util.ArrayList;

public class RotaPlanner {

	public static void main(String[] args) {
		ArrayList<Employee> staff = new ArrayList<>();
		staff.add(new Employee("Manager", 40, Availability.WEEKDAYS));
		staff.add(new Employee("Student", 10, Availability.WEEKENDS));
		staff.add(new Employee("Staff", 25, Availability.BOTH));

		ArrayList<Shift> shifts = new ArrayList<>();
		shifts.add(new Shift("Monday", "06:00", "14:00", 8, false));
		shifts.add(new Shift("Saturday", "14:00", "19:30", 5.5, true));
		shifts.add(new Shift("Monday", "12:00", "16:00", 4, false));

		System.out.println("Staff:");
		for (int i = 0; i < staff.size(); i++) {
			System.out.println(" " + staff.get(i));
		}

		// assign each shift to the first employee who is available to work it
		for (int i = 0; i < shifts.size(); i++) {
			Shift shift = shifts.get(i);
			for (int j = 0; j < staff.size(); j++) {
				Employee employee = staff.get(j);
				if (employee.canWork(shift)) {
					shift.setAssignedTo(employee);
					break;
				}
			}
		}

		System.out.println("Rota:");
		for (int i = 0; i < shifts.size(); i++) {
			System.out.println(" " + shifts.get(i));
		}

	}

}
