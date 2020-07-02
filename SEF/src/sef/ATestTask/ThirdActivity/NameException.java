package sef.ATestTask.ThirdActivity;

public class NameException extends Exception {

    public NameException(String incorrectName) {
        super("Name should not contain number, incorrect name :" +incorrectName);
    }
}
