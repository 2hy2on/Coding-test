import java.util.*;
import java.io.*;

public class Main {    
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] arr = new String[5][15];

        for(int i=0; i<5; i++) { //배열에 원소 저장
            String str = br.readLine();
            for(int j=0; j<str.length(); j++) {
                arr[i][j] = String.valueOf(str.charAt(j));
            }
        }

        for(int i=0; i<15; i++) {
            for(int j=0; j<5; j++) {
                if(arr[j][i] == null)
                    arr[j][i] = "";
                bw.write(arr[j][i]);
            }
        }
        bw.close();        
    }    
}