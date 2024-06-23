class Solution {
    List<Integer> list;
    
    public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<Integer>();
        inorder(root);
        return list;
    }
    
    public void inorder(TreeNode node) {
        if(node != null) {
            if(node.left != null) inorder(node.left);
            list.add(node.val);
            if(node.right != null) inorder(node.right);
        }  
    }
}