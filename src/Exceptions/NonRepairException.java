package Exceptions;

public class NonRepairException extends Exception
{
    @Override
    public String toString() {
        return "Exception, car health already 100";
    }
}
