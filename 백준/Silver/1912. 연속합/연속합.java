import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] nums = new int[n];
        int [] dp = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        dp[0] = nums[0];
        for (int i = 1; i< n; i++){
            if(dp[i-1] + nums[i] < nums[i])
                dp[i] = nums[i];
            else
                dp[i] = dp[i-1] + nums[i];
        }
        int max = dp[0];

        for(int i = 1; i < n; i++){
            if(max < dp[i])
                max = dp[i];
        }
        System.out.println(max);
    }
}