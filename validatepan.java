import java.util.Scanner;

public class validatepan {
    public static void main(String[] args) {
    	System.out.println("Enter the PAN no :");
        Scanner scanner = new Scanner(System.in);
        String pan = scanner.next();
        char c[] = pan.toCharArray();
        System.out.println(validatePanNo(c));
    }

    private static String validatePanNo(char[] c) {
        if(c.length!=10){
            return "Invalid PAN no";
        }
        for(int i =0;i<10;i++){
            if((i >= 0 && i<=4) && (c[i] < 'A' || c[i] > 'Z')){
                return "Invalid PAN no";
            }
            else if((i > 4 && i <=8) && (c[i] < 48 || c[i] > 57)){
                return "Invalid PAN no";
            }
            else if(i==9 && (c[i] < 'A' || c[i] > 'Z')){
                return "Invalid PAN no";
            }
        }
        return "Valid PAN no";
    }
}