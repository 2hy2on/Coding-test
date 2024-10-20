import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //dp 배열은 array 배열과 동일하게 취급하기 -> 안될 경우 배열 차원 다시 고민
        //min 함수 적극 활용하기
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        int[][] dp = new int[n][3];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        for(int i = 1 ; i < n; i++){
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + arr[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + arr[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + arr[i][2];
        }
        System.out.println(Math.min(Math.min(dp[n-1][0], dp[n-1][1]), dp[n-1][2]));
    }

}