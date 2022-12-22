package cci.ch_4_graphs_and_trees;

public class T_4_4_CheckBalanced {

    public static boolean checkBalanced(TreeNode node) {
        return new BalancedCheck(node).check();
    }

    static class BalancedCheck {
        int minDepth = Integer.MAX_VALUE;
        int maxDepth = 0;
        TreeNode root;

        BalancedCheck(TreeNode root) {
            this.root = root;
        }

        public boolean check() {
            return check(root, 1);
        }

        private boolean check(TreeNode node, int depth) {
            if (node == null) {
                return true;
            }
            if (node.left != null || node.right != null) {
                return check(node.left, depth + 1) && check(node.right, depth + 1);
            }
            minDepth = Math.min(depth, minDepth);
            maxDepth = Math.max(depth, maxDepth);
            return maxDepth - minDepth < 2;
        }
    }

}
