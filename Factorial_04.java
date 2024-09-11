import java.util.Scanner;

public class Factorial_04 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        int fact = 1;
        for(int i=1;i<=n;i++){
            
            fact = fact * i;
        }
        
        System.out.println("facctorial of "+n+" is "+fact);
    }
}
