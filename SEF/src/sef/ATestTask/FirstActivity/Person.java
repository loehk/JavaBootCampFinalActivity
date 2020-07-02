package sef.ATestTask.FirstActivity;

import sef.ATestTask.ThirdActivity.NameException;

import java.util.Objects;

public class Person {

//TODO 1 Implement Person Attributes

    private int age;
    private String secondName;
    private String firstName;

    //Behavior - default constructor
    public Person() {
        this.firstName = "Unknown";
        this.secondName = "Unknown";
        this.age = 0;
    }

    //Behavior - parameterized constructor
    public Person(String firstName, String secondName, int age) throws NameException {
		hasDissalowedNumbers(firstName);
		hasDissalowedNumbers(secondName);
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public Person(Person person) throws NameException {
		hasDissalowedNumbers(person.firstName);
		hasDissalowedNumbers(person.secondName);
        this.firstName = person.firstName;
        this.secondName = person.secondName;
        this.age = person.age;
    }

    // getter for String firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameException {
		hasDissalowedNumbers(firstName);
        this.firstName = firstName;
    }

    // getter for int age
    public int getAge() {
        return age;
    }

    // setter for int age
    public void setAge(int age) {
        this.age = age;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) throws NameException {
		hasDissalowedNumbers(secondName);
        this.secondName = secondName;
    }

    //TODO 2 add all person info into announce() method
    public String announce() {

        return String.format("My name is " + getFirstName() + " " + getSecondName() + " and i am " + getAge() + " years old");
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", secondName=" + secondName + ", firstName=" + firstName + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, firstName, secondName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Person))
            return false;
        Person other = (Person) obj;
        return age == other.age && Objects.equals(firstName, other.firstName)
                && Objects.equals(secondName, other.secondName);
    }


    public boolean hasDissalowedNumbers(String word) throws NameException {
        if (word == null) {
            return false;
        }

        if (word.contains("0")) {
            throw new NameException(word);
        }
        if (word.contains("1")) {
            throw new NameException(word);
        }
        if (word.contains("2")) {
            throw new NameException(word);
        }
        if (word.contains("3")) {
            throw new NameException(word);
        }
        if (word.contains("4")) {
            throw new NameException(word);
        }
        if (word.contains("5")) {
            throw new NameException(word);
        }
        if (word.contains("6")) {
            throw new NameException(word);
        }
        if (word.contains("7")) {
            throw new NameException(word);
        }
        if (word.contains("8")) {
            throw new NameException(word);
        }
        if (word.contains("9")) {
            throw new NameException(word);
        }
        if (word.contains("10")) {
            throw new NameException(word);
        }
        return false;
    }

}

