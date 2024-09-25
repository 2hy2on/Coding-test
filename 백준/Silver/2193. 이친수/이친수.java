import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Long dp[] = new Long[N+1];

        dp[0] = 0L;
        dp[1] = 1L;
        for(int i = 2; i <= N; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        System.out.println(dp[N]);
    }


}