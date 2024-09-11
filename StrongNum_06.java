import java.util.Scanner;

public class StrongNum_06 {

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int sum =0;
        int m = n;
      while(n!=0){
        int rem = n%10;
         sum = sum+ factorial(rem);
        n = n/10;
      }

      System.out.println(sum==m?"Strong number":"not a Strong Num ");

      System.out.println("sum of factorial of num is: "+sum);
    }
}
