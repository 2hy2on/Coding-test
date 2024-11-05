import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int prime_num = 2;

        if (N == 1) {
            return;
        }

        while(true) {

            while(N % prime_num == 0) {
                N /= prime_num;
                System.out.println(prime_num);

            }

            if ( N != 1) {
                prime_num++;
            } else {
                break;
            }
        }
    }
}