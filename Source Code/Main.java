import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
	Employee em [] = new Employee[9];
	    em [0] = (new Staff("Allen", "Paita", "123",'M', 2, 23, 59, 50.00));
		em [1] = (new Staff("Zapita", "Steven", "456", 'F', 7, 6, 64, 35.00));
		em [2] = (new Staff("Rios", "Enrique", "789", 'M', 6, 2, 70, 40.00));

		em [3] = (new Faculty("Johnson", "Anne", "243", 'F', 4, 27, 62, "PhD", "Engineering", 3, Faculty.Level.FULL));
		em [4] = (new Faculty("Bouris", "William", "791", 'F', 3, 14, 75, "PhD","English", 1, Faculty.Level.ASSOCIATE_PROFESSOR));
		em [5] = (new Faculty("Andrade","Christopher", "623", 'F', 5, 22, 80, "MS", "Physical Education", 0, Faculty.Level.ASSISTANT_PROFESSOR));

		em [6] = (new Partime("Guzman", "Augusto", "455", 'F', 8, 10, 77, 35.00, 30));
		em [7] = (new Partime("Depirro", "Martin", "678", 'F', 9, 15, 87, 30.00, 15));
		em [8] = (new Partime("Aldaco", "Marque", "945", 'M', 11, 24, 88, 20.00, 35));

         System.out.println("Part A : Employee Information in Ascending Order of Employee Id\n");
    	 Collections.sort(Arrays.asList(em), new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
                    return o1.getID().compareToIgnoreCase(o2.getID());
                }

        });
		 for (Employee emp : em) {
                System.out.println(emp.toString());
                System.out.println("");
            }
		System.out.println("STAFF\n");

            for (Employee emp : em) {

                if (emp.getClass() == Staff.class) { 

                    System.out.println(emp.toString());

                    System.out.println("---");
				}
			}
		System.out.println();

        System.out.println("FACULTY\n");

            for (Employee emp : em) {

                if (emp.getClass() == Faculty.class) {

                    System.out.println(emp.toString());

                    System.out.println("---");

                }

            }
		System.out.println();

        System.out.println("PART TIME \n");

            for (Employee emp : em) {

                if (emp.getClass() == Partime.class) { 

                    System.out.println(emp.toString());

                    System.out.println("---");

                }

            }
        
        System.out.println("Part B: Total Monthly Salary for Part Time Staff");

		double total_part_time = 0.0;

            for (Employee emp : em) {
                if (emp instanceof Partime) {
                    total_part_time += emp.monthlyEarning();
                }
            }
		System.out.println("  " + "$" + total_part_time + "\n");

		System.out.println("Part C: Total Monthly Salary for All Employees");

		double total_salary = 0.0;
            for (Employee emp : em) {
                total_salary += emp.monthlyEarning();
            }
		System.out.println("  " + "$" + total_salary + "\n");

		
    } 
	
}
    
	


