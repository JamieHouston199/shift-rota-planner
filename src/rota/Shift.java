package rota;

public class Shift {
	private String day;
	private String start;
	private String end;
	private double hours;
	private boolean weekend;
	
	public Shift(String day,String start,String end, double hours,boolean weekend) {
		this.day=day;
		this.start=start;
		this.end=end;
		this.hours=hours;
		this.weekend=weekend;
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
	@Override
	public String toString() {
		return day +" "+start+"-"+end+" ("+ hours + "h)";
	}

}
