import java.util.*;
public class Main {

	public static void main(String[] args) {
		int min;
		int hour;
		Scanner sc = new Scanner(System.in);
		hour = sc.nextInt();
		min = sc.nextInt();
		
		if(0 <= min && min < 45)
		{
			min += 15;
			if(hour == 0)
				hour = 23;
			else
				hour -= 1;
		}
		else if(45 <= min && min <= 59)
			min -= 45;
		System.out.println(hour + " "+ min);
		
	}
}
