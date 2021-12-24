import java.text.DecimalFormat;

public class Faculty extends Employee implements Cloneable {
	enum Level {
		ASSISTANT_PROFESSOR,
		ASSOCIATE_PROFESSOR,
		FULL; 
	}
	private Level professor;
	private Education education;
    private static DecimalFormat df2 = new DecimalFormat("#.00");
	
    
    public void setEducation(Education edu){
    	education = edu;
    }
    
	Faculty() {
		super();
		education = new Education();
	}
	
	Faculty(String last_name, String first_name, String Id, char sex, int month, int day, int year, String deg, String maj, int res, Level prof) {
		super(last_name, first_name, Id, sex, month, day, year);
		this.setProfessor(prof); 
		education = new Education(deg,maj,res);
		
	}
	
	public Level getProfessor() {
		return professor;
	}
	
	public void setProfessor(Level prof) {
		this.professor = prof;
	}
	
	public double monthlyEarning() {
		if(professor == Level.ASSISTANT_PROFESSOR) {
			return FACULTY_MONTHLY_SALARY;
		}
		else if(professor == Level.ASSOCIATE_PROFESSOR) {
			return FACULTY_MONTHLY_SALARY*1.2;
		}
		else {
			return FACULTY_MONTHLY_SALARY*1.4;
		}
		
	}		
	
	public String toString() {
		return super.toString() + "\n" +  "  " + "Level: " + professor + "\n" + "  " + "Degree: " + education.getDegree() +
		"\n" + "  " + "Major: " + education.getMajor() + "\n" + "  " + "Research: " + education.getResearch();
	}
	  
	public Object clone() throws CloneNotSupportedException
	{
		Faculty edu = (Faculty)super.clone();
		education = (Education) education.clone();
		edu.setEducation(education);
		return edu; 
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
