package sef.ATestTask.FirstActivity;

import java.util.Comparator;
import java.util.Objects;

import sef.ATestTask.ThirdActivity.NameException;

public class Employee extends Person {

	private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

	//TODO 1 create different constructors
    public Employee(){

    }
    
    public Employee(int empId, String firstName, String secondName, String jobTitle, String companyName, double salary) throws NameException {
		super();
		super.setFirstName(firstName);
		super.setSecondName(secondName);
		this.empId = empId;
		this.jobTitle = jobTitle;
		this.companyName = companyName;
		this.salary = salary;
	}
    
	public Employee(int empId, String jobTitle, String companyName) {
		super();
		this.empId = empId;
		this.jobTitle = jobTitle;
		this.companyName = companyName;
		this.salary = 0.00d;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String announce() {
		return super.announce()+" I work as a/an "+getJobTitle()+" in "+getCompanyName();
	}
	

	public static Comparator<Employee> sortByAscendingSalary = new Comparator<Employee>() {
        @Override
        public int compare(Employee jc1, Employee jc2) {
            return (Double.compare(jc1.getSalary(), jc2.getSalary()));
        }
    };
    
	public static Comparator<Employee> sortByDescendingSalary = new Comparator<Employee>() {
        @Override
        public int compare(Employee jc1, Employee jc2) {
            return (Double.compare(jc2.getSalary(), jc1.getSalary()));
        }
    };
    
    @Override
	public String toString() {
		return "Employee [empId=" + empId + ", jobTitle=" + jobTitle + ", companyName=" + companyName + ", salary="
				+ salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(companyName, empId, jobTitle, salary);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(companyName, other.companyName) && empId == other.empId
				&& Objects.equals(jobTitle, other.jobTitle)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

    //TODO 2 add getters and setters


    //TODO 3 override method announce()




}