import java.io.*;
import java.util.*;

public class Main {
	
	static int N;
	static String[][] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new String[N][N];
		for(int i=0;i<N;i++)
			Arrays.fill(arr[i]," ");
		star(0,0,N);
		
		 for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	            	sb.append(arr[i][j]);
	            }
	            sb.append("\n");
		 }
		System.out.println(sb);
	}// main()
	
	static void star(int x, int y, int n) {
		if(n==1) {
			arr[x][y]="*";
			return;
		}
		
		 for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (!(i == 1 && j == 1)) {
	                    star( x + i * (n / 3), y + j * (n / 3), n / 3);
	                }
	            }
	        }
		
	}//star()

}// class Main