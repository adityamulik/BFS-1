/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BinaryTreeLevelOrderTraversalDFS {
    
    List<List<Integer>> result;
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        /*
         * DFS Approach
         * Time Complexity: O(n) as we loop over entire tree and access each element
         * Space Complexity: O(n) as queue is used to store each element
         *
         */
        result = new ArrayList<>();
        
        if (root == null) return result;                
        
        // DFS 
        dfs(root, 0);
        
        return result;
    }
    
    private void dfs(TreeNode root, int level) {
        
        // base case
        if (root == null) return;
        
        // logic    
           
        if (result.size() == level) {
            result.add(new ArrayList<>());
        }           
        
        result.get(level).add(root.val);
        dfs(root.left, level+1);
        dfs(root.right, level+1);
    }
}
