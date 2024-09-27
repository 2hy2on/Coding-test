import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < N; i++){
            String str = sc.nextLine();

            if(parenthsis(str)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

    private static boolean parenthsis(String str) {
        Stack st = new Stack();

        for(int i = str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            if('(' == ch){
                //1. str이 남았는데 stack에 아무것도 없는경우
                if(st.isEmpty()){
                    return false;
                }
                char c = (char) st.peek();
                if(')' ==c){
                    st.pop();
                    //2, 스택이 다 비고 str i ==0일때 
                    if(st.isEmpty() && i == 0){
                        return true;
                    }
                }
            }
            else if (')' ==ch){
                st.push(ch);
            }
        }
        //str은 끝났는데 stack에 남아있을 경우
        return false;
    }


}