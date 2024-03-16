import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] numArr = new int[N][M];

        for (int row = 0; row < N; row++) {
            for (int column = 0; column < M; column++) {
                numArr[row][column] = scanner.nextInt(); // 기존 값 추가
            }
        }

        for (int addRow = 0; addRow < N; addRow++) {
            for (int addColumn = 0; addColumn < M; addColumn++) {
                numArr[addRow][addColumn] += scanner.nextInt(); // 기존 값 + 새로 입력받은 값
                System.out.print(numArr[addRow][addColumn] + " ");
            }
            System.out.println();
        }
    }
}