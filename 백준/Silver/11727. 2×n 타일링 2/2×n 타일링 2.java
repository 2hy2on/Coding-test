import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] =1;
        for(int i=2; i<=n; i++) {
            // 이전꺼 + 세로 하나 덧붙임 and  2번전꺼에 큰 2 * 2사각형 하나, 가로 2개짜리 하나 총 2경우 붙임(세로 붙이는 경우는 이미 포함되었기 때문에 제외)
            dp[i] = (dp[i-1] + 2*dp[i-2]) %10007;
        }

        System.out.println(dp[n]);
    }

}