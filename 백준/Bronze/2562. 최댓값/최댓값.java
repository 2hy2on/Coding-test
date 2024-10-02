import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] num = new int[9];
		int i;
		int max = -1;
		int maxIndex = 0;
		Scanner sc = new Scanner(System.in);
		for(i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if(num[i] > max) {
				max = num[i];
				maxIndex = i;
			}
		}
		System.out.println(max);
		System.out.print(maxIndex + 1);
	}

}