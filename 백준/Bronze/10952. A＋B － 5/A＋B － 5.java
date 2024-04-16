import java.util.*;
public class Main {

	public static void main(String[] args) {
		int A;
		int B;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		
		while(A > 0 && B < 10)
		{
            System.out.println(A + B);
			A = sc.nextInt();
			B = sc.nextInt();
		}

	}

}
