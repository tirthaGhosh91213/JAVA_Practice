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
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return ans;
        List<Integer> level =new ArrayList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
           TreeNode currnode= q.remove();
           if(currnode==null){
            ans.add(level);
            level=new ArrayList<>();
            if(q.isEmpty()) break;
            else q.add(null);
           }else {
            level.add(currnode.val);
            if(currnode.left!=null){
                q.add(currnode.left);
            }if(currnode.right!=null) {
                q.add(currnode.right);
            }
           }
        }
        return ans ;
    }
}