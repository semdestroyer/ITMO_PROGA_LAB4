package Exceptions;

public class NonDriveException extends Exception
{
    @Override
    public String toString() {
        return " Exception. It's not a Driver!!!!";
    }
}