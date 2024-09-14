import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[]= new int[num+1];
        int dp[]= new int[num+1];
//        int picked[]= new int[num];

        for(int i = 1; i <= num; i++){
            arr[i] = sc.nextInt();
        }

        dp[0] = 0;

//        picked[0]=1;
//        picked[1]=1;

//        //3연속 선택인걸 어떻게 알까
//        for(int i = 2; i< num; i++){
//            //내 앞에 이미 3개가 다 픽 되었으면
//            if(picked[i-2] ==1&& picked[i-1] ==1){
//                int minIndex = getMinIndex(arr[i-2],arr[i-1],i);
//                if(dp[i-1] < dp[i-1] +arr[i] -arr[minIndex]){
//                    dp[i] = dp[i-1] +arr[i] -arr[minIndex];
//                    picked[minIndex] = 0;
//                    picked[i] = 1;
//                }
//                else{
//                    dp[i] = dp[i-1];
//                }
//            }
//            else {
//                //아닌경우
//                dp[i] = dp[i - 1] + arr[i];
//                picked[i] = 1;
//            }
//        }

        for(int i=1; i<= num; i++) {
            //1일때 2일때도 for문에 추가해줘야함 - 따로 처음에 초기화하면 index out of bound error 뜸!!! 주의하기
            if (i == 1) {
                dp[1] = arr[1];
            } else if (i == 2) {
                dp[2] = arr[1] + arr[2];
            } else {
                //나 제외하기/ 나 고르고 내 앞 안골랐을때 / 나와 내 앞 골랐을 때
                dp[i] = Math.max(Math.max(dp[i - 1], dp[i - 2] + arr[i]), dp[i - 3] + arr[i] + arr[i - 1]);
            }
        }
        System.out.println(dp[num]);
    }

//    private static int getMinIndex(int a, int b, int index) {
//        if(a < b){
//            return index - 2;
//        }
//
//        return index-1;
//    }


}