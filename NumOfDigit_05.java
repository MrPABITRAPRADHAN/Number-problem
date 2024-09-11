import java.util.Scanner;

public class NumOfDigit_05 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int c=0;
        System.out.print("The num in reverse roder: ");
        while (n!=0) {
            int rem = n%10;
            System.out.print(rem);
            c++; 
            n = n/10;

        }
        System.out.println(" ");
        System.out.println("The number of digit is : "+c);
    }
}
