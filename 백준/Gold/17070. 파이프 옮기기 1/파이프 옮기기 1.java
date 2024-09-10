import java.util.Scanner;

public class Main {
    static int ans;
    static int n;
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n+1][n+1];

        for(int i=1; i <= n; i++){
            for(int j=1; j <= n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        ans = 0;
        DFS(1,2,0);

        System.out.println(ans);
    }

    private static void DFS(int x, int y, int dir) {
        if (x == n && y == n) { // 종료 조건
            ans++;
            return;
        }
        switch (dir){
            //파이프가 가로일 경우, 동쪽 대각선
            case 0:
                if(y+1<=n && arr[x][y+1] != 1){
                    DFS(x, y+1, 0);
                }
                break;
            case 1: //파이프가 세로일 경우
                if(x+1<=n && arr[x+1][y] !=1){
                    DFS(x+1, y, 1);
                }
                break;
            case 2: // 파이프가 대각선일 경우, 갈 수 있는 경우는 동쪽과 남쪽, 대각선임.
                if (y + 1 <= n && arr[x][y + 1] != 1) { // 동쪽
                    DFS(x, y + 1, 0);
                }

                if (x + 1 <= n && arr[x + 1][y] != 1) { // 남쪽
                    DFS(x + 1, y, 1);
                }
                break;

        }
        // 파이프가 어떤 방향이든지, 대각선은 검사해서 가장 아래로 뺐음.
        if (y + 1 <= n && x + 1 <= n && arr[x][y + 1] == 0 && arr[x + 1][y] == 0 && arr[x + 1][y + 1] == 0) {
            DFS(x + 1, y + 1, 2);
        }

    }
}