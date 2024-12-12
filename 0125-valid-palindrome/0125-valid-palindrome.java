class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                sb.append(c);
            }
        }

        String s1 = sb.toString().toLowerCase();

        StringBuilder reverse = new StringBuilder();
        for (int i = sb.toString().length() - 1; i >= 0; i--) {
            reverse.append(sb.charAt(i));
        }

        String s2 = reverse.toString().toLowerCase();

        if (s1.equals(s2)) {
            return true;
        } else {
            return false;
        }
    }
}