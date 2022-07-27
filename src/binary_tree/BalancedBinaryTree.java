package binary_tree;

public class BalancedBinaryTree {

    private static int height(BinaryTreeNode<Integer> root){
        if (root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static boolean isBinaryTreeBalanced(BinaryTreeNode<Integer> root){
        if (root == null){
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }

        boolean isLeftBalanced = isBinaryTreeBalanced(root.left);
        boolean isRightBalanced = isBinaryTreeBalanced(root.right);

        return isLeftBalanced && isRightBalanced;
    }
}
