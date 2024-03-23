import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stone = sc.nextInt();
        
        if (stone % 2 == 0)
            System.out.println("CY");
        else
            System.out.println("SK");

    }
}