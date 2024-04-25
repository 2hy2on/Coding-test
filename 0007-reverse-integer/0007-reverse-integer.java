class Solution {
    public int reverse(int x) {
        int answer = 0;

        while (x != 0) {
            int overflowCheck = answer * 10 + x % 10;

            if ((overflowCheck - x % 10) / 10 != answer) {
                return  0;
            }

            x /= 10;
            answer = overflowCheck;
        }

        return answer;
    }
}