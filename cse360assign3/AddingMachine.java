/**
* Assignment #:2
* Name: Tarun anandanpillai
* ASU ID : 1212930717
* ASU email: tvananda@asu.edu
* Course: CSE360 , W 9:40 am -10:30 am
* Description: The following program is a calculator which adds and subtracts according to the input
* github link : https://github.com/tarun1682/cse360assign2
*/
package cse360assign3;

/*
 * The following class AddingMachine is a public class which acts like a calculator
 * for adding a number, you input a number to the add method 
 * for subtracting a number, you input a number to the subtract method
 * for displaying the result, you need call the toString method which displayes the calculated value
 * for clearing the calculator, you need to call the clear method
 */

public class AddingMachine {

    /* initializes total as a protected integer */
    protected int total;
    /* initializes result as a protected string */
    protected String result = " ";
    /* initializes returnString as a protected string */
    protected String returnString = "0";
    /**
     * constructor AddingMachine
     *
     * @param  takes no parameters
     * initializes total to 0
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }
     /**
     * method getTotal()
     *
     * @param takes no parameter
     * @return    total
     */
    public int getTotal () {
        return total;
    }
    /**
     * method add()
     *
     * @param takes int value as parameter
     * @return    nothing
     * re-initializes total to total+value
     * re-initializes returnString to (returnString) + (" + ") + (value)
     */
    public void add (int value) {
        total+=value;
        returnString +=  " + " + value;
    }
    /**
     * method subtract()
     *
     * @param takes int value as parameter
     * @return    nothing
     * re-initializes total to total-value
     * re-initializes returnString to (returnString) + (" - ") + (value)
     */
    public void subtract (int value) {
        total-=value;
        returnString += " - " + value ;
    }
    /**
     * method toString()
     *
     * @param takes no parameter
     * @return    returnString
     */
    public String toString () {
        return returnString; 
    }
    /**
     * method clear()
     *
     * @param takes no parameter
     * @return    nothing 
     * re-initializes returnString to " 0 "
     */
    public void clear() {
        returnString = " 0 ";
        total = 0;
    }
}