package Task3;

public class Employee {
	public String name, designation;
	public int salary, experience;
	public String email;
	public long phone;
	public Employee(String name, String designation,int salary, int experience, String email, long phone) {
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		this.experience=experience;
		this.email=email;
		this.phone=phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public void empdetails() {
		System.out.println("name:\n"+name+"\ndesignation: "+designation+"\nsalary:\n"+salary+"\nexperience:\n"+experience+"\nemail:\n"+email+"phone:\n"+phone);
	}

}
