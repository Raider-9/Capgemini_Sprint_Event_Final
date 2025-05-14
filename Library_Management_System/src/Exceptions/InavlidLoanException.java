package Exceptions;
import java.lang.RuntimeException;

//This is a basic template and needs to be changed 
public class InavlidLoanException extends RuntimeException {
    public InavlidLoanException(String message) {
        super(message);
    }

}
