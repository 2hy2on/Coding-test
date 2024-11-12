import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		sc.close();
		
		int arr[] = new int[26];
		Arrays.fill(arr, -1); // 전부 다 -1로 초기화 
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i); // b .. a.. e.. k .. 순서대로 
			
			if(arr[ch - 'a']==-1) { //-1인 경우에만 수정 (처음 등장하는 위치 조건)  
				arr[ch-'a'] = i;  
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
}