
public class Education implements Cloneable {
	
	private String Degree;
	private String Major;
	private int Research;
	
	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
	
	Education() {
		Degree = null;
		Major = null;
		Research = 0;
	}
	
	Education(String deg, String maj, int res) {
		this.setDegree(deg);
		this.setMajor(maj);
		this.setResearch(res);
	}
	
	public String getDegree() {
		return Degree;
	}
	
	public void setDegree(String deg) {
		this.Degree = deg;
	}
	
	public String getMajor() {
		return Major;
	}
	
	public void setMajor(String maj) {
		this.Major = maj;
	}
	
	public int getResearch() {
		return Research;
	}
	
	public void setResearch(int res) {
		this.Research = res;
	}
}
