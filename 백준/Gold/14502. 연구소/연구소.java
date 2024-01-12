import java.util.*;

public class Main {
    static int[][] virus;
    static int result = Integer.MIN_VALUE;
    static int n, m = 0;
    static int[] locX = {1, -1, 0, 0}, locY = {0, 0, 1, -1};

    public static void main(String[] ars) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        virus = new int[n][m];


        //입력 받기
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                virus[i][j] = sc.nextInt();
            }
        }


        //벽 세우기
        pickWallLocations(0);

        System.out.println(result);
    }
    private static void pickWallLocations(int wallCnt){
        int i, j;
        if(wallCnt == 3){
            bfs();
            return;
        }
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                if(virus[i][j] == 0){
                    virus[i][j] = 1;
                    pickWallLocations(wallCnt+1);
                    virus[i][j] = 0; //원복 시킴
                }
            }
        }
    }

    static void bfs(){
        Queue<Map.Entry<Integer, Integer>> queue = new LinkedList<>();
        //temp로 복사해놓기
        int[][] tempVirus = new int[n][m];
        for (int i = 0; i < n; i++) {
            if (m >= 0) System.arraycopy(virus[i], 0, tempVirus[i], 0, m);
        }
        for(int i = 0; i< n; i++){
            for(int j = 0; j < m; j++){
                if(tempVirus[i][j] == 2)
                    queue.add(new AbstractMap.SimpleEntry<>(i, j));
            }
        }

        //감염시키기
        while(!queue.isEmpty()){
            Map.Entry<Integer, Integer> current = queue.poll();
            int x = current.getKey();
            int y = current.getValue();


//            //좌
//            if(y -1>= 0 && tempVirus[x][y-1] == 0){
//                tempVirus[x][y-1] = 2;
//                queue.add(new AbstractMap.SimpleEntry<>(x, y-1));
//            }
//            if(x -1>= 0 && tempVirus[x-1][y] == 0){
//                tempVirus[x-1][y] = 2;
//                queue.add(new AbstractMap.SimpleEntry<>(x-1, y));
//            }
//            if(y +1< m  && tempVirus[x][y+1] == 0){
//                tempVirus[x][y+1] = 2;
//                queue.add(new AbstractMap.SimpleEntry<>(x, y+1));
//            }
//            if(x +1< n  && tempVirus[x+1][y] == 0){
//                tempVirus[x+1][y] = 2;
//                queue.add(new AbstractMap.SimpleEntry<>(x+1, y));
//            }

            for(int loc = 0; loc < 4; loc++){
                int nx = x +locX[loc];
                int ny = y +locY[loc];
                if (ny >= 0 && nx >= 0 && nx < n && ny < m) {
                    if (tempVirus[nx][ny] == 0) {
                        tempVirus[nx][ny] = 2;
                        queue.add(new AbstractMap.SimpleEntry<>(nx, ny));
                    }
                }
            }
        }
        count(tempVirus);
    }

    static void count(int[][] tempVirus){
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tempVirus[i][j] == 0) {
                    cnt++;
                }
            }
        }
        result = Math.max(result, cnt);
    }
}

