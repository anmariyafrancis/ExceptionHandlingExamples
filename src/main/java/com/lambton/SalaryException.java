package com.lambton;

public class SalaryException extends Exception
{
    private String message;
    SalaryException(String message)
    {
        this.message=message;
    }
    @Override
    public String getMessage()
    {
        return message;
    }

}
