import java.util.Scanner;
public class duckNum_09 {
    public static void main(String[] args) {
        
        System.out.println("enter the number");
        Scanner inp = new Scanner(System.in);
        int n  = inp.nextInt();

        int c=0,r=0;
        // for(int i=0;i<=n; i++){   //its workinng
        //     r = n%10;
        //     System.out.println(r==0?"duck no":"not a duck no");
        //     n= n/10;
        // }

        while(n!=0){
            r = n%10;
            if(r==0){
                c++;
            }
            n = n/10;
        }
        System.out.println(c>0?"Duck no":"not a duck no");
    }
}
