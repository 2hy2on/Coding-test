
import java.util.Scanner;

public class Main {
    static int[][]arr;
    static int[] virus;
    static int com;
    static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        com = sc.nextInt();
        int n= sc.nextInt();
        arr = new int[com+1][com+1];
        virus = new int[com+1];
        cnt = 0;
        //1은 이미 바이러스 감염
        virus[1] =1;

        for(int i = 1; i <= n; i++){
            int a= sc.nextInt();
            int b= sc.nextInt();

            //양방향 필요
            arr[a][b] =1;
            arr[b][a] = 1;
        }
        //1이 바이러스 감염됨
        DFS(1);
        System.out.println(cnt);
    }

    private static void DFS(int n) {
        for(int i = 1; i <= com;i++){
            if(arr[n][i] ==1) { //연결되어있는 컴퓨터 찾기
                if(virus[i] != 1) { //감염 아직이면
                    virus[i] = 1; //감염
                    cnt++; //하나 늘려주기
                    DFS(i); //연결된 컴퓨터 찾기
                }
            }
        }
    }
}