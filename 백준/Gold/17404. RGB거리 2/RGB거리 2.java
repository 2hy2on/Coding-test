import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] dp = new int[N+1][3];
        int[][] arr = new int[N+1][3];
        int min = Integer.MAX_VALUE;

        for(int i = 1; i <= N; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int c = 0; c < 3; c++) { //색상별로 case 돌려줌
            for(int i = 0; i < 3; i++){
                if(c == i) //일치할 때만 올바른 값 넣기 (RGB 일 때 경우의 수 분리해줌)
                    dp[1][i] = arr[1][i];
                else
                    dp[1][i] = 1000 * 1000; //일치하지 않을 땐 큰 값 넣기
            }
            for (int j = 2; j <= N; j++) {
                dp[j][0] = Math.min(dp[j - 1][1], dp[j - 1][2]) + arr[j][0];
                dp[j][1] = Math.min(dp[j - 1][0], dp[j - 1][2]) + arr[j][1];
                dp[j][2] = Math.min(dp[j - 1][0], dp[j - 1][1]) + arr[j][2];
            }
            for(int k = 0; k < 3; k++){
                if(k != c) //첫번째랑 마지막이랑 같은 색상일 때는 제외해줌
                    min = Math.min(min, dp[N][k]);
            }
        }
        System.out.println(min);
    }

}