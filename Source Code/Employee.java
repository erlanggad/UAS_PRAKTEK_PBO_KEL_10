import java.util.Calendar;
import java.util.GregorianCalendar;
import java.lang.Comparable;


public abstract class Employee implements Comparable<Employee>, Cloneable, Info_Employee {	
	
	private String last_name;
	private String first_name;
	private String ID_number;
	private char Sex;
	private Calendar birthdate = new GregorianCalendar(); 

	Employee() {
		last_name = null;
		first_name = null;
		ID_number = null;
		Sex = ' ';
	}

	Employee(String last_name, String first_name, String Id, char sex, int month, int day, int year) {
		this.setLastName(last_name);
		this.setFirstName(first_name);
		this.setID(Id);
		this.setSex(sex); 
		this.setBirthdate(month, day, year);
	}
	
	public String getLastName() {
		return last_name;
	}

	public void setLastName(String last_name) {
		this.last_name = last_name;
	}

	public String getFirstName() {
		return first_name;
	}
	
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
	
	public String getID() {
		return ID_number;
	}
	
	public void setID(String Id) {
		this.ID_number = Id;
	}
	
	public char getSex() {
		return Sex;
	}
	
	public void setSex(char sex) {
		this.Sex = sex;
	}
	
	public String getBirthdate() {
		 return birthdate.get(Calendar.MONTH) + "/" + birthdate.get(Calendar.DAY_OF_MONTH) + "/" + birthdate.get(Calendar.YEAR);
		 
	}

	public void setBirthdate(int month, int day, int year) {
	    birthdate.set(Calendar.MONTH, month);
	    birthdate.set(Calendar.DAY_OF_MONTH, day); 
	    birthdate.set(Calendar.YEAR, year);
	}
	
	public String toString() {
		String Employee;
		Employee = "  " + "Last Name: " + last_name + "\n" + "  " + "First name: " + 
		first_name + "\n" + "  " + "ID: " + ID_number + "\n" + "  " + "Sex: " + 
		Sex + "\n" + "  " + "Birth date: " + getBirthdate(); 
		return Employee;
	}

	public abstract double monthlyEarning();
	

	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
	
	public int CompareTo(Employee other) {
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
