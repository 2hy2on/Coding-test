import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(NumberCount(N));
	}
 
	private static int NumberCount(int N) {
		
		int cnt = 0;
		
		if(N<100) {
			return N;
		} else {
			cnt = 99;
			
			for(int i=100; i<=N; i++) {
				
				int A = i / 100;
				int B = (i / 10) % 10;
				int C = i % 10;
				
				if(B-A == C-B) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}