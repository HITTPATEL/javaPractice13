package day13.Q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	   public static void main(String[] args) {
		   System.out.println("Start of main..");
		  try {
			  Scanner sc = new Scanner(System.in);
			   
			   System.out.println("Enter num1");
			   int num1 = sc.nextInt();
			   
			   System.out.println("Enter num2");
			   int num2 = sc.nextInt();
			   
			   String message = null;
			   int num3 = num1 / num2;
			   
			   if(num3 > 10){
			   message = "Welcome to Exception Handling ";
			   }
			   else {
				   message=null;
			   }
			   System.out.println("Message is :"+message.toUpperCase());
		} catch(ArithmeticException ae) {
		     System.out.println("num2 should not be 0");
		}
		  catch (NullPointerException npe) {
			  System.out.println("String value is null");
		  }
		  catch(InputMismatchException ime){
			   System.out.println("Please enter valid number");
		  
		  }
		  catch (Exception e) {
			// TODO: handle exception
			  System.out.println("Something Wrong");
		}
		   
		   System.out.println("End of main");
	}
}
