class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }
    public static boolean check(TreeNode left, TreeNode right){
        if (left == null && right == null) return true;
        else if (left == null || right == null) return false;
        
        if (left.val == right.val) {
            return check(left.right, right.left) && check(left.left, right.right);
        }
        else return false;
    }
}