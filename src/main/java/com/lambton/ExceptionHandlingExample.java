package com.lambton;

public class ExceptionHandlingExample
{
    public static void main(String[] args)
    {
        System.out.println("START");
        int a=20;
        int b=10;
        int c[]=new int[]{1,2,3};
        String s="Hai";
        Person p=new Person();

        try
        {
            int output = a/ b;
            System.out.println("Output: " + output);
            System.out.println("Array Value: " + c[1]);
            System.out.println("Length of string :" + s.length());

            p.setName("Anmariya");
            p.setSalary(500);

        }
        catch (ArithmeticException e)
        {
            System.out.println("Error:"+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Error:"+e.toString());
        }

        catch (SalaryException e)
        {
            System.out.println("Error:"+e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Other Error:"+e.toString());
        }
        finally
        {
            System.out.println("I am in finally block");
        }
        System.out.println("END");
    }
}
