import java.util.*;
public class Main {
	public static void main(String[] args) {
		int n;
		int max = -1;
		double total = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] score = new int[n];
		
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			if(max < score[i])
				max = score[i];
		}
		for(int i = 0; i < score.length; i++) {
			total += ((double)score[i] / max) * 100;
		}
		System.out.println(total / n);
		
		
	}

}