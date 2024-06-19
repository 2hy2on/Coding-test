class Solution {
    public int climbStairs(int n) {
        int[] memoi = new int[10000];
        memoi[1] = 1;
        memoi[2] = 2;

        for(int i = 3; i <= n; i++) {
            memoi[i] = memoi[i-1] + memoi[i-2];
        }

        return memoi[n];
    }
}