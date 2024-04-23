import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x;
		int y;
		int n = 0;
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x > 0 && y >0)
			n = 1;
		else if(x < 0 && y > 0)
			n = 2;
		else if(x < 0 && y < 0)
			n = 3;
		else if(x > 0 && y < 0)
			n = 4;
		System.out.println(n);
	}

}