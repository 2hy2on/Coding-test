class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        
        var left = minDepth(root.left);
        var right = minDepth(root.right);
        
        if(left == 0 && right == 0) return 1;
        if(left != 0 && right != 0) return Math.min(left, right) + 1;
        
        return Math.max(left, right) + 1;
    }
}
