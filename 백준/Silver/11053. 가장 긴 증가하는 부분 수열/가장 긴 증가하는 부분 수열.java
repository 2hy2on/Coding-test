import java.util.Scanner;

public class Main {
	static int N;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		// 각 위치에서의 LIS를 저장할 1차원 dp 테이블을 정의한다.
		int[] dp = new int[N];
		// 최대 LIS의 값.
		int max = 1;

		// 첫 번째 원소부터 N번째 원소까지 dp 테이블의 값을 채워 나간다.
		for (int i = 0; i < N; i++) {
			// 우선 해당 위치를 본인의 길이(1)로 초기화한다.
			dp[i] = 1;
			// 현재 원소의 위치에 대하여, 앞의 원소의 값을 비교하며 값을 갱신한다.
			for (int j = 0; j < i; j++) {
				// 만일 부분 수열이 증가할 가능성이 있다면
				if (arr[j] < arr[i]) {
					// dp 테이블에 저장된 LIS를 바탕으로 가장 큰 값을 dp[i]의 값으로 갱신한다.
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}

			// 전체 수열에서 LIS의 값을 갱신한다.
			max = Math.max(max, dp[i]);
		}

		System.out.println(max);
		sc.close();
	}
}