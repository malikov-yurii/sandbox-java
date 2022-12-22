package cci.ch_4_graphs_and_trees;

public class T_4_5_ValidateBinarySearchTree {

    public static boolean isBST(TreeNode<Integer> root) {
        return root != null && validateBST(root).succeeded();
    }

    private static ValidationResult validateBST(TreeNode<Integer> root) {
        if (root == null) {
            return ValidationResult.SUCCESS;
        }
        ValidationResult leftValidation = validateBST(root.left);
        if (!leftValidation.validateMaxLessThanOrEqualTo(root.data)) {
            return ValidationResult.FAIL;
        }
        ValidationResult rightValidation = validateBST(root.right);
        if (!rightValidation.validateMinGreaterThan(root.data)) {
            return ValidationResult.FAIL;
        }
        return new ValidationResult(true,
                leftValidation.getMinOrElse(root.data),
                rightValidation.getMaxOrElse(root.data));
    }

    static class ValidationResult {
        static final ValidationResult FAIL = new ValidationResult(false, null, null);
        static final ValidationResult SUCCESS = new ValidationResult(true, null, null);
        final boolean isSuccess;
        final Integer max;
        final Integer min;

        public ValidationResult(boolean isSuccess, Integer min, Integer max) {
            this.isSuccess = isSuccess;
            this.max = max;
            this.min = min;
        }
        boolean failed() {
            return !this.succeeded();
        }
        boolean succeeded() {
            return this.isSuccess;
        }
        boolean validateMinGreaterThan(int data) {
            return this.succeeded() && (this.min == null || min > data);
        }
        boolean validateMaxLessThanOrEqualTo(int data) {
            return this.succeeded() && (this.max == null || max <= data);
        }

        public Integer getMinOrElse(Integer data) {
            return this.min != null ? this.min : data;
        }

        public Integer getMaxOrElse(Integer data) {
            return this.max != null ? this.max : data;
        }
    }

}
