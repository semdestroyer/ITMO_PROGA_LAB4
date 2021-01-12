package Exceptions;

public class NonDriveException extends RuntimeException
{
    @Override
    public String toString() {
        return " Exception. It's not a Driver!!!!";
    }
}