package kg.hometask.classCykinder;
import kg.hometask.classCykinder.GeoMetry.*;


public class NegativeValueException extends Exception {
    public NegativeValueException() {
    }

    public NegativeValueException(String message){
        super(message);
    }
    void printMessage(){
        System.out.println("__NegativeValueException__ " );
    }
}
