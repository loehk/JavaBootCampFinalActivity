package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import sef.ATestTask.ThirdActivity.NameException;

public class EmployeeTest extends TestCase {

    public void checkEmployeeCreatedProperly() throws NameException{
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }
    
    public void checkEmployeeSettersGetters() throws NameException {
    	
    	String name = "Name";
    	String surname = "Surname";
    	String jobTitle = "jobTitle";
    	String companyName = "companyName";
    	double salary = 2.00d;
    	int age = 1;
  
        Employee expectedEmployee = new Employee(age, name,surname, jobTitle, companyName, salary);
        Employee resultEmployee = new Employee();
        resultEmployee.setAge(age);
        resultEmployee.setFirstName(name);
        resultEmployee.setSecondName(surname);
        resultEmployee.setJobTitle(jobTitle);
        resultEmployee.setCompanyName(companyName);
        resultEmployee.setSalary(2.00d);
        assertEquals(expectedEmployee, resultEmployee);
        
        assertEquals(age, resultEmployee.getAge());
        assertEquals(name, resultEmployee.getFirstName());
        assertEquals(surname, resultEmployee.getSecondName());
        assertEquals(jobTitle, resultEmployee.getJobTitle());
        assertEquals(companyName, resultEmployee.getCompanyName());
        assertEquals(salary, resultEmployee.getSalary());
        
    }

}