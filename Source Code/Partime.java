
public class Partime extends Staff {
	private double hours_worked;
	
	Partime() {
		super();
		hours_worked = 0.0;
	}
	
	Partime(String last_name, String first_name, String Id, char sex, int month, int day, int year, double hourly_rate, double hours_work) {
		super(last_name, first_name, Id, sex, month, day, year, hourly_rate);
		this.setHoursWorked(hours_work);
	}
	
	public double getHoursWorked() {
		return hours_worked;
	}
	
	public void setHoursWorked(double hours_worked) {
		this.hours_worked = hours_worked;
	}
	
	public double monthlyEarning() {
		return super.getHourlyrate()*hours_worked*4;
	}
	
	public String toString() {
		return super.toString() + "\n"  + "  " + "Hours worked per week: " + hours_worked; 
	}

}
