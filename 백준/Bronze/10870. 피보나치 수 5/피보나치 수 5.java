import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.println(cal(n));
	}
	
	public static int cal(int n) {
		if(n==0) return 0;
		else if (n==1) return 1;
		return cal(n-2)+cal(n-1);
	}
}
            
