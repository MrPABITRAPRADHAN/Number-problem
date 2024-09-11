public class sunnyNum_08 {
    public static void main(String[] args) {
        int n = 9; 
        n = n +1;
        int c=0;

        for(int i=0;i<n;i++){
            if(i*i == n){
               c++;
               break;
            }

            if(i*i > n){  
                break;
            }
        }

        System.out.println(c==1?"Sunny Num":"Not a Sunny Num ");
    }
}
