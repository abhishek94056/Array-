package Task3;
import java.util.Scanner;
public class Home {
	/*B. Create array of Employee as:
		public class Employee {
			public String name, designation;
			public int salary, experience;
			public String email;
			public long phone;
		}

		1. Print name of all freshers.
		2. Print email ids of all managers.
		3. Print phone number of highly paid employee.
		4. Print all information of Sumit.
		5. Print all information of all employees.*/

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Employee e[] = new Employee[5];
		for(int i = 0;i<e.length;i++) {
			System.out.println("Enter Employee Name: ");
			String name =s.nextLine();
			System.out.println("Enter Employee Designation: ");
			String designation=s.nextLine();
			System.out.println("Enter Employee Salary: ");
			int salary = s.nextInt();
			System.out.println("Enter Employee Experience: ");
			int experience = s.nextInt();
			s.nextLine();
			System.out.println("Enter Employee Email: ");
			String email = s.nextLine();
			System.out.println("Enter Employee Phone: ");
			long phone = s.nextLong();
			s.nextLine();
			e[i]=new Employee(name, designation,salary, experience, email, phone);
		}
		
		System.out.println("name of all freshers: ");
		for(int i = 0;i<e.length;i++) {
			if(e[i].getExperience() == 0) {
				System.out.println(e[i].getName()+" is a Fresher");
			}
		}

		System.out.println("email ids of all managers: ");
		for(int i = 0;i<e.length;i++) {
			if(e[i].designation.equals("Manager")) {
				System.out.println(e[i].email);
			}
		}

		System.out.println("phone number of highly paid employee: ");
		int empSalary = e[0].getSalary();
		long empPhone = e[0].getPhone();
		for(int i = 0;i<e.length;i++) {
			if(e[i].getSalary()>empSalary) {
				System.out.println("highly paid employee Contact no. is "+empPhone);
			}			
		}

		System.out.println("information of Sumit: ");
		boolean b = true;
		for(int i = 0;i<e.length;i++) {
			if("Sumit".equalsIgnoreCase(e[i].getName())) {
				System.out.println("Name: " + e[i].getName());
		        System.out.println("Designation: " + e[i].getDesignation());
		        System.out.println("Salary: " + e[i].getSalary());
		        System.out.println("Experience: " + e[i].getExperience() + " years");
		        System.out.println("Email: " + e[i].getEmail());
		        System.out.println("Phone: " + e[i].getPhone());
		        b =false;
			}
		}
		if(b){
			System.out.println("Sumit is not available");
		}

		System.out.println("information of all employees: ");
		for(int i = 0;i<e.length;i++) {		
				e[i].empdetails();
		}

	}
	
	

}
