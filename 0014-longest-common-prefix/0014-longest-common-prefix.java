class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (String str : strs) {
                if (str.length() <= i || c != str.charAt(i)) {
                    return sb.toString();
                }
            }

            sb.append(c);
        }


        return sb.toString();
    }
}