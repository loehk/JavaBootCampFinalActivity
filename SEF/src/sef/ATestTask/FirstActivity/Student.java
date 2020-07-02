package sef.ATestTask.FirstActivity;

import sef.ATestTask.ThirdActivity.NameException;

//TODO Implement class Student with parent Person

public class Student extends Person {
	
	public Student(Person person, String schoolName) throws NameException {
		super(person);
		this.schoolName = schoolName;
	}

	String schoolName;

	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	@Override
	public String announce() {
		return "I study at university "+getSchoolName();
	}

}
