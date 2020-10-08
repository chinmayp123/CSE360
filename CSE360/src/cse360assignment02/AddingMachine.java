/**
 * The AddingMachine program implements an application that
 * simply adds, subtracts and finds the total for the operation.
 * 
 * @author   Chinmay Pulaa
 * @version  2.0
 * @since    2020-10-07
 */
package cse360assignment02;

public class AddingMachine {
  private int total;			//Private  integer variable total
  private String history = "0";	// Private String vairbale history
  
  public AddingMachine () {
	  // AddingMachine function 
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
	  //Get Total function
    return total;
  }
  
  public void add (int value) {
	  // add function, adds given value to total
	   total=value+total;
	   history = " + " + value;
  }

  public void subtract (int value) {
	  // subtract function, subtracts given value from the total
	  total=total-value;
	  history = " - " + value;
  }

  public String toString () {
	  //to String give the return statement of the following operation that where made
    return history;
  }

  public void clear() {
	  //clears the data
	  total = 0;
	  history = " 0 ";
  }
}

