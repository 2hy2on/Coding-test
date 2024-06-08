class Solution {

  public int lengthOfLastWord(String s) {
    int result = 0;
    for (int idx = s.length() - 1; idx >= 0; idx--) {
      if (s.charAt(idx) != ' ') {
        result++;
      } else {
        if (result > 0) {
          break;
        }
      }
    }
    return result;
  }

}