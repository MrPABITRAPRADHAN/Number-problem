import java.util.Scanner;

public class PrimeNum_02 {
    public static void main(String[] args) {
        System.out.println("Enter the number to check prime no. or not: ");

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int c=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }

        if(c==2){
            System.out.println("prime number");
        }else{
            System.out.println("not a prime number");
        }
    }
}
