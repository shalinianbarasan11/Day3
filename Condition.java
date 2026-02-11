
/*2. Perform the following:
       a. Get the input from user like add,sub,div
       b. Based on the input perform the mathematical operation using any conditional statement */
import java.util.Scanner;
public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method 

      Scanner ope = new Scanner(System.in);
      System.out.println("Enter the value of x: ");
      int x = ope.nextInt();
      System.out.println("Enter the value of y: ");
      int y = ope.nextInt();
      System.out.println("Operation of Add,Sub,Div: ");
      String math = ope.next();
      switch(math){
    	  case "add":
    		  System.out.println("res -" +(x+y));
    		  break;
    	  case "sub":
    		  System.out.println("res -" +(x-y));
    		  break;
    	  case "div":
    		  System.out.println("res -" +(x/y));
    		  break;
      }
      ope.close();
	}

}
