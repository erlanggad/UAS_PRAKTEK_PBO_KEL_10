import java.text.DecimalFormat;

public class Staff extends Employee {
	private double Hourly_rate;
    private static DecimalFormat df2 = new DecimalFormat("#.00");

	
	Staff() {
		super();
		Hourly_rate = 0.0;
	}
	
	Staff(String last_name, String first_name, String Id, char sex, int month, int day, int year, double hourly_rate) {
		super(last_name, first_name, Id, sex, month, day, year); 
		this.setHourlyRate(hourly_rate);
	}
	
	public double getHourlyrate() {
		return Hourly_rate;
	}
	
	public void setHourlyRate(double hourly_rate) {
		this.Hourly_rate = hourly_rate;
	}
	 
	public double monthlyEarning() {
		return Hourly_rate*160;
	} 
	
	public String toString() {
		return super.toString() + "\n" + "  " + "Hourly rate: " + "$" + df2.format(getHourlyrate());
	}

	@Override
	public int compareTo(Employee other) {
			if (getLastName().compareTo(other.getLastName()) > 0)
			{ 
				return -1;
			}
			if (getLastName().compareTo(other.getLastName()) < 0)
			{ 
				return 1;
			}
			else 
			return 0;
	}

	
	
}
