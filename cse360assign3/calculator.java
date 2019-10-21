package cse360assign3;


public class calculator extends AddingMachine
{
    public void mult(int value)
    {
        System.out.println("yes");
        total = total*value;
        returnString = returnString + " * " + value;
    }
    public void div(int value)
    {
        if(value==0)
        {
            total = 0;
        }
        else
        {
            total = total/value;
            returnString = returnString + " / " + value;
        
        }
        
    }
    public void power(int value)
    {
        if(value<0)
        {
            total = 0;
        }
        else
        {
            total = (int)Math.pow(super.total,value);
            returnString = returnString + " ^ " + value;
        }
        
    }
    
}
