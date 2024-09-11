public class perfectNum_07 {

    public static void main(String[] args) {
        int n = 28;
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum == n ? "Strong num" : "not a strong num");
    }
}
