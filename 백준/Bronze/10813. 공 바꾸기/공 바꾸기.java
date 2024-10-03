import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n; int m;

        n = sc.nextInt();
        m = sc.nextInt();
        int [] num = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = i+1;
        }

        int temp;
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            temp = num[a-1];
            num[a-1] = num[b-1];
            num[b-1] = temp;
        }

        for(int i = 0; i < n; i++){
            System.out.print(num[i]+" ");
        }
    }
}