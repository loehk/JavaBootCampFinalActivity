package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import sef.ATestTask.ThirdActivity.NameException;

public class FirstActivity {

	public static void main(String[] args) throws NameException {
		
		List<Employee> employeeList = new ArrayList();

		for (int i=0; i<10; i++) {
			Random rand = new Random();
			double salary =  rand.nextDouble() * (1000.00 - 100.00) + 100.00;
			int empId = i;
			String name ="name";
			String surname ="surname";
			String jobTitle ="title"+i;
			String companyName="companyName"+i;
			Employee emp = new Employee(empId, name, surname, jobTitle, companyName, salary);
			employeeList.add(emp);
		}
		System.out.println("Unsorted");
		employeeList.forEach(employee -> System.out.println(employee.getSalary()));

		System.out.println("Sorted");

		employeeList.sort(Employee.sortByAscendingSalary);
		employeeList.forEach(employee -> System.out.println(employee.toString()));
		
		Person student = new Person();
		System.out.println(student.announce());
		student = new Student(student, "RTU");
		System.out.println(student.announce());
	
	
		
		

		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result

		//TODO 3 create instance of a Student as a Person ->
		// than ask him introduce()
		// than make them Student
		// than ask him introduce()

		//TODO 4 Create method for full change of employee information
		// for example some employee change his work


	}
	
	public static Employee changeAllEmployeeInfo(Employee employee, int empId, String jobTitle, String companyName, double salary, int age, 
	 String secondName, String firstName) throws NameException {
		employee.setEmpId(empId);
		employee.setJobTitle(jobTitle);
		employee.setCompanyName(companyName);
		employee.setSalary(salary);
		employee.setFirstName(firstName);
		employee.setAge(age);
		employee.setSecondName(secondName);
		return employee;
	}
	
}
