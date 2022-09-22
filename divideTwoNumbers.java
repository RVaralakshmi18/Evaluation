import java.util.*;

public class divideTwoNumbers
{
    public String divideNumbers(int number1, int number2)
    {
        int value =0 ;
        String str = "";
        
        try
        {
            value= number1/number2;
            str = ("The answer is "+ value);
        }
        catch(ArithmeticException e)
        {
            str = "Division by zero is not possible";
        }
        finally
        {
            return(str+". Thanks for using the application.");    
        }
    }
    
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1 =  scn.nextInt();
        int num2 =  scn.nextInt();
        divideTwoNumbers div = new divideTwoNumbers();
        System.out.print(div.divideNumbers(num1,num2));
    }
}