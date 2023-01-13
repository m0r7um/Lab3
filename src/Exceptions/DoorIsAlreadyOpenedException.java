package Exceptions;

public class DoorIsAlreadyOpenedException extends Exception{
    public DoorIsAlreadyOpenedException(String message){
        super(message);
    }
}

