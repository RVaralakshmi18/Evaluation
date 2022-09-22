import java.util.*;
	public class Cinematicket
	{
	    public static void main(String args[])
	    {
	        int no;
	        double cost,total=0;
	        String ref,co,cir,cl;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the no of ticket:");
	        no=sc.nextInt();
	        System.out.println("Do you want refreshment:");
	        ref=sc.next();
	        System.out.println("Do you have coupon code:");
	        co=sc.next();
	        System.out.println("Enter the circle:");
	        cir=sc.next();
	        if(no<5 || no>40)
	        {
	            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
	            return;
	        }
	        if(cir.charAt(0) == 'k')
	            cost=75*no;
	        else if(cir.charAt(0) == 'q')
	            cost=150*no;
	        else
	        {
	         System.out.println("Invalid Input");
	         return;
	        }
	        total=cost;
	        if(no>20)
	            cost= cost - ((0.1)*cost);
	        total=cost;
	        if(co.charAt(0)== 'y')
	            total= cost - ((0.02)*cost);
	        if(ref.charAt(0)== 'y')
	            total += (no*50);
	        System.out.println("Ticket cost:");
	        System.out.print(total);
	    }
	}