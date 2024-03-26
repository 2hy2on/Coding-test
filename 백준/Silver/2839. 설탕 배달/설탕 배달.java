import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        3kg 5kg
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        while(n >= 0) {

            if (n % 5 == 0) {
                cnt += n / 5;
                System.out.println(cnt);
                break;
            }
            n-=3;
            cnt++;
            if(n < 0 ){
                System.out.println(-1);
                break;
            }
        }


    }
}