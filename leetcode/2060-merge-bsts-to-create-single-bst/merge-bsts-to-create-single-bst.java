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

    Map<Integer, TreeNode> map = new HashMap<>();
    Set<Integer> leaves = new HashSet<>();

    public TreeNode canMerge(List<TreeNode> trees) {

        // Store every root
        for (TreeNode root : trees) {
            map.put(root.val, root);

            // Store all leaf values
            if (root.left != null) {
                leaves.add(root.left.val);
            }

            if (root.right != null) {
                leaves.add(root.right.val);
            }
        }

        // Find the final root
        TreeNode root = null;

        for (TreeNode node : trees) {
            if (!leaves.contains(node.val)) {
                root = node;
                break;
            }
        }

        if (root == null) {
            return null;
        }

        // Remove final root from map
        map.remove(root.val);

        // Merge trees
        if (!merge(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            return null;
        }

        // All trees must be used
        if (!map.isEmpty()) {
            return null;
        }

        return root;
    }

    public boolean merge(TreeNode root, int min, int max) {

        if (root == null) {
            return true;
        }

        if (root.val <= min || root.val >= max) {
            return false;
        }

        // If current node is a leaf
        if (root.left == null && root.right == null) {

            // If another tree starts from this value
            if (map.containsKey(root.val)) {

                TreeNode newRoot = map.get(root.val);

                root.left = newRoot.left;
                root.right = newRoot.right;

                map.remove(root.val);
            }
        }

        return merge(root.left, min, root.val) &&
               merge(root.right, root.val, max);
    }
}