import java.io.*;
import java.util.Scanner;
public class numberpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	     int n = in.nextInt();
	     int sum = 0, r;
		 int temp = n;    
	     while(n>0)
		   {    
	        r = n % 10;   
	        sum = (sum*10)+r;    
	        n = n/10;    
	       }    
	      if(temp==sum)    
	        System.out.println("Palindrome.");    
	      else    
	        System.out.println("Not a palindrome");    
	     }  
	}
