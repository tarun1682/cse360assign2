package cse360assign2;


public class AddingMachine {

    private int total;
    private String result = " ";
    private String returnString = "0";
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }
    
    public int getTotal () {
        return total;
    }
    
    public void add (int value) {
        total+=value;
        returnString +=  " + " + value;
    }
    
    public void subtract (int value) {
        total-=value;
        returnString += " - " + value ;
    }
        
    public String toString () {
        return returnString; 
    }

    public void clear() {
        returnString = " 0 ";
    
    }
}