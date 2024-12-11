class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> visited = new ArrayList<>();
        traversal(root, visited);
        
        return visited;
    }
    
    public void traversal(TreeNode root, List<Integer> visited) {
        
        if(root == null) return;
        
        visited.add(root.val);
        traversal(root.left, visited);
        traversal(root.right, visited);
    }
}