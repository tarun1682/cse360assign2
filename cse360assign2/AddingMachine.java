/**
* Assignment #:2
* Name: Tarun anandanpillai
* ASU ID : 1212930717
* ASU email: tvananda@asu.edu
* Course: CSE360 , W 9:40 am -10:30 am
* Description: The following program is a calculator which adds and subtracts according to the input
* github link : https://github.com/tarun1682/cse360assign2
*/
package cse360assign2;

/*
 * The following class AddingMachine is a public class which acts like a calculator
 * for adding a number, you input a number to the add method 
 * for subtracting a number, you input a number to the subtract method
 * for displaying the result, you need call the toString method which displayes the calculated value
 * for clearing the calculator, you need to call the clear method
 */

public class AddingMachine {

    /* initializes total as a private integer */
    private int total;
    /* initializes result as a private string */
    private String result = " ";
    /* initializes returnString as a private string */
    private String returnString = "0";
    /*
     * The following constructor AddingMachine, initializes the int variable total to 0.
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }
     /*
     * The following method getTotal, returns the total value.
     */
    public int getTotal () {
        return total;
    }
    /*
     * The following method add, takes a number as parameter and adds it to total
     * it also stores the value in returnString to print it when called
     */
    public void add (int value) {
        total+=value;
        returnString +=  " + " + value;
    }
    /*
     * The following method subtract, takes a number as parameter and subtracts it from total
     * it also stores the value in returnString to print it when called
     */
    public void subtract (int value) {
        total-=value;
        returnString += " - " + value ;
    }
    /*
     * The following method toString, stores all the calculations done as a string
     * and returns the string containing the calculations
     */
    public String toString () {
        return returnString; 
    }
    /*
     * The following method clear, clears the calculator
     */
    public void clear() {
        returnString = " 0 ";
    
    }
}