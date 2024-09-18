import java.util.Scanner;

public class Main {
    static int cnt;
    static int[][] arr;
    static int [][] picked;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //test case

        for(int i = 0; i <T; i++){
            int M = sc.nextInt(); //horizontal length
            int N = sc.nextInt(); //vertical length
            int K = sc.nextInt(); //배추 location
            cnt = 0;

            arr = new int[N][M];
            picked = new int[N][M];
            for(int j = 0; j < K; j++){
                int a= sc.nextInt();
                int b= sc.nextInt();
                arr[b][a] = 1;
            }
            for(int k = 0; k < N; k++){
                for(int l = 0; l < M; l++){
                    if(arr[k][l] == 1 && picked[k][l] == 0) {
                        cnt++;
                        dfs(k, l);
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    private static void dfs( int k, int l) {
        picked[k][l] = 1;
        int dx[] = {1,0,-1,0};
        int dy[] = {0,1,0,-1};

        for(int i = 0; i < 4; i++){
            if(k+dx[i] < picked.length && l+dy[i] < picked[0].length &&
                    0 <= k+dx[i] && 0 <= l+dy[i] && picked[k+dx[i]][l+dy[i]] != 1 && arr[k+dx[i]][l+dy[i]] == 1){
                dfs(k+dx[i],l+dy[i]);
            }
        }
    }


}