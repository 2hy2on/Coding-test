import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
		br.close();
        
        // Math의 클래스의 pow()메서드를 사용했다.
        // Math.pow(거듭제곱할 숫자, 거듭제곱(몇제곱인지);
        System.out.println((int)Math.pow(Math.pow(2, n) +1, 2));
    }
}