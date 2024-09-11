import java.util.Scanner;

public class squareNum_03 {
    public static void main(String[] args) {
         System.out.println("Enter the number: ");

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        int c=0;
        for(int i=1;i<=n;i++){
            if(i*i == n){
                c++;
                break;
            }
            if(i*i >n){
                break;
            }
        }

        System.out.println(c==1?"square no":"not a square no");
    }
}
