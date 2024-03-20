import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int N, M;
        
        N = sc.nextInt();
        M = sc.nextInt();
        
        int[] arr = new int[N+1];
        
        for(int i=1; i<=N; i++) {
            arr[i] = arr[i-1] + sc.nextInt();
            
        }
        
        int a, b; // 시작항과 끝항
        for(int i=0; i<M; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            
            System.out.println(arr[b]-arr[a-1]);
        }
        
    }
}