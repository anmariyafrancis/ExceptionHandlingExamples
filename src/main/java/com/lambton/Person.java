package com.lambton;

public class Person
{
    void setName(String name) throws NullPointerException
    {
        if(name==null)
        {
            throw new NullPointerException("Name cannot be null");
        }
        System.out.println("length of name:"+name.length());
    }
    public void setSalary(int salary) throws SalaryException
    {
        if(salary<1000)
        {
            throw new SalaryException("Salary<1000");
        }
    }
}
