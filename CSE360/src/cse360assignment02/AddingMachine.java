package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history = "0";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	   total=value+total;
	   history = " + " + value;
  }

  public void subtract (int value) {
	  total=total-value;
	  history = " - " + value;
  }

  public String toString () {
    return history;
  }

  public void clear() {
	  total = 0;
	  history = " 0 ";
  }
}

