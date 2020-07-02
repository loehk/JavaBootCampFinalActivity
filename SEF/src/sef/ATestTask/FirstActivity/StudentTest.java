package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import sef.ATestTask.ThirdActivity.NameException;

public class StudentTest extends TestCase{

    public void checkEmployeeSettersGetters() throws NameException{

        String name = "Name";
        String surname = "Surname";
        int age = 1;
        String schoolName = "schoolName";

        Person basePerson = new Person(name, surname, age);
        Student expectedPerson = new Student(basePerson, schoolName);
        Student resultPerson = new Student(schoolName);
        resultPerson.setSchoolName(schoolName);
        resultPerson.setAge(age);
        resultPerson.setFirstName(name);
        resultPerson.setSecondName(surname);
        assertEquals(expectedPerson, resultPerson);

        assertEquals(schoolName, resultPerson.getSchoolName());
        assertEquals(age, resultPerson.getAge());
        assertEquals(name, resultPerson.getFirstName());
        assertEquals(surname, resultPerson.getSecondName());
    }
}
