import java.util.Scanner;
public class factorsOfNum_01{
    public static void main(String[] args) {

        System.out.println("Enter the number : ");

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int c=0;
        System.out.println("the Factors are :");
        for(int i =1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                c++;
            }
        }
        System.out.println("the number of factors are : "+c);
    }

}