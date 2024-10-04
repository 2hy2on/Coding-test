import java.util.Scanner;

public class Main {
    static int cnt1;
    static int cnt2;
    static int N;
    static int picked[][];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        sc.nextLine();
        char arr[][] = new char[N][N];
        for(int i =0; i <N; i++){
            String line = sc.nextLine();
            for(int j = 0; j < N; j++){
                arr[i][j] = line.charAt(j);
            }
        }

        picked = new int[N][N];

        for(int i =0; i <N; i++){
            for(int j = 0; j < N; j++){
                if(picked[i][j] == 0) {
                    dfs1(arr, i, j);
                    cnt1++;
                }
            }
        }

        picked = new int[N][N];

        for(int i =0; i <N; i++){
            for(int j = 0; j < N; j++){
                if(picked[i][j] == 0) {
                    dfs2(arr, i, j);
                    cnt2++;
                }
            }
        }

        System.out.println(cnt1+" "+cnt2);
    }


    private static void dfs1(char[][] arr, int x, int y) {
        int dx[] = {-1,0,0,1};
        int dy[] = {0, -1, 1, 0};

        for(int i = 0; i< dx.length; i++){
            if(x+dx[i] >= 0 && x+dx[i] < N && y+dy[i]>= 0 && y+dy[i] < N){
                if(arr[x][y] == arr[x+dx[i]][y+dy[i]]&&
                        picked[x+dx[i]][y+dy[i]] == 0 ){
                    picked[x+dx[i]][y+dy[i]] = 1;
                    dfs1(arr, x+dx[i], y+dy[i]);
                }

            }
        }
        
    }
    private static void dfs2(char[][] arr, int x, int y) {
        int dx[] = {-1,0,0,1};
        int dy[] = {0, -1, 1, 0};

        for(int i = 0; i< dx.length; i++){
            if(x+dx[i] >= 0 && x+dx[i] < N && y+dy[i]>= 0 && y+dy[i] < N){
                if(arr[x][y]=='R' || arr[x][y] == 'G'){
                    if((arr[x+dx[i]][y+dy[i]] == 'R' ||
                            arr[x+dx[i]][y+dy[i]] == 'G' ) &&
                                    picked[x+dx[i]][y+dy[i]] == 0 ){
                        picked[x+dx[i]][y+dy[i]] = 1;
                        dfs2(arr, x+dx[i], y+dy[i]);
                    }
                }
                else if(arr[x][y] == arr[x+dx[i]][y+dy[i]]&&
                        picked[x+dx[i]][y+dy[i]] == 0 ){
                    picked[x+dx[i]][y+dy[i]] = 1;
                    dfs2(arr, x+dx[i], y+dy[i]);
                }

            }
        }

    }

}