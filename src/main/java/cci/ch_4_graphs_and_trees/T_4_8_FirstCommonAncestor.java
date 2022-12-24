package cci.ch_4_graphs_and_trees;

public class T_4_8_FirstCommonAncestor {

    public static TreeNode getFirstCommonAncestor(TreeNode n, TreeNode n1, TreeNode n2) {
        Result result = searchFirstCommonAncestor(n, n1, n2);
        return result.isAncestor ? result.node : null;
    }

    public static Result searchFirstCommonAncestor(TreeNode n, TreeNode n1, TreeNode n2) {
        if (n == null) {
            return new Result(null, false);
        }
        if (n == n1 && n == n2) {
            return new Result(n, true);
        }
        Result foundLeft = searchFirstCommonAncestor(n.left, n1, n2);
        if (foundLeft.isAncestor) {
            return foundLeft;
        }
        Result foundRight = searchFirstCommonAncestor(n.right, n1, n2);
        if (foundRight.isAncestor) {
            return foundRight;
        }
        if (foundLeft.node != null && foundRight.node != null) {
            return new Result(n, true);
        }
        if (n == n1 || n == n2) {
            boolean isAncestor = foundLeft.node != null || foundRight.node != null;
            return new Result(n, isAncestor);
        }
        return foundRight.node != null ? foundRight : foundLeft;
    }

    private static class Result {
        final TreeNode node;
        final boolean isAncestor;
        Result(TreeNode node, boolean isAncestor) {
            this.node = node;
            this.isAncestor = isAncestor;
        }
    }

}