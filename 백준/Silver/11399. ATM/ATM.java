
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] n = new int[num];
		int temp;
		int res = 0;
		
		for(int i = 0; i < num; i++) {
			n[i] = sc.nextInt();
		}
		
		for(int i = 1; i< num; i++) {
			for(int j = 0; j < i; j++) {
				if(n[i] < n[j]) {
					temp = n[j];
					n[j] = n[i];
					n[i] = temp;
				}
			}
		}
		
		for(int i = 0; i < num; i++) {
			res += n[i] * (num - i);
	
		}
		System.out.println(res);
	}

}
