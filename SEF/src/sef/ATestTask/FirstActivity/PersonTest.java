package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import sef.ATestTask.ThirdActivity.NameException;

public class PersonTest extends TestCase{

    public void checkEmployeeSettersGetters() throws NameException{

        String name = "Name";
        String surname = "Surname";

        int age = 1;

        Person expectedPerson = new Person(name, surname, age);
        Person resultPerson = new Person();
        resultPerson.setAge(age);
        resultPerson.setFirstName(name);
        resultPerson.setSecondName(surname);
        assertEquals(expectedPerson, resultPerson);

        assertEquals(age, resultPerson.getAge());
        assertEquals(name, resultPerson.getFirstName());
        assertEquals(surname, resultPerson.getSecondName());
    }
}
