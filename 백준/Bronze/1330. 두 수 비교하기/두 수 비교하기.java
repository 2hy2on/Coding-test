import java.util.*;
public class Main {
	public static void main(String[] args) {
			int num1;
			int num2;
			String str;
			@SuppressWarnings("resource")
			Scanner n = new Scanner(System.in);
			num1 = n.nextInt();
			num2 = n.nextInt();
			
			if(num1 > num2)
				str = ">";
			else if(num1 < num2)
				str = "<";
			else
				str = "==";
			System.out.println(str);
		}
}