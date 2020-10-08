/**
 * The AddingMachine program implements an application that
 * simply adds, subtracts and finds the total for the operation.
 * 
 * @author   Chinmay Pulapa
 * @version  2.0
 * @since    2020-10-07
 */
package cse360assignment02;

public class AddingMachine {
  private int total;			//Private  integer variable total
  private String history = "0";	// Private String vairbale history
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  /**
   * This method gets the total
   * @return NOTHING
   */
  
  public int getTotal () {
    return total;
  }
  
  /**
   * This method is the add function
   * @param value
   * @return Total + value
   */
  
  public void add (int value) {
	   total=value+total;
	   history = " + " + value;
  }
  
  /**
   * This method is the subtract function
   * @param value 
   * @return Total - value
   */
 
  public void subtract (int value) {
	  // subtract function, subtracts given value from the total
	  total=total-value;
	  history = " - " + value;
  }

  /** 
   * This method will show us the final calculation by displaying all the operations
   * @return history
   */
  
  public String toString () {
	  //to String give the return statement of the following operation that where made
    return history;
  }

  /**
   * This method will clear all the calculations which make total and history equal to 0.
   * @return history, total
   */
  
  public void clear() {
	  //clears the data
	  total = 0;
	  history = " 0 ";
  }
}

