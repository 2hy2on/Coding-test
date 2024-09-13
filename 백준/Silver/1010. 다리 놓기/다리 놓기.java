import java.util.Scanner;

public class Main {
    static int[][] dp = new int[30][30];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            //조합
            System.out.println(combination(M, N));
        }
    }

    private static int combination(int n, int r) {
        // 이미 풀린 경우 바로 반환
        if(dp[n][r] > 0) {
            return dp[n][r];
        }

        if(n == r || r == 0) {
            return dp[n][r] = 1;
        }

        // 파스칼
        return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }

}