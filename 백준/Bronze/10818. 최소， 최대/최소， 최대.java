import java.util.*;
public class Main {

	public static void main(String[] args) {
		int N;
		int[] num; //배열 선언, 생성된 건 아님 초기화 필요
		int i;
		int max = -1000000;
		int min = 1000000;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		num = new int[N];
		
		for(i = 0; i < N; i++) {
			num[i] = sc.nextInt();
			if(max < num[i])
				max  = num[i];
			if(min > num[i])
				min = num[i];
		}
		System.out.print(+ min + " "+ max);

	}

}