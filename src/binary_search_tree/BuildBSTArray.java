package binary_search_tree;

import binary_tree.BinaryTreeNode;
import binary_tree.BinaryTreeUse;

public class BuildBSTArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        BinaryTreeNode<Integer> root = createBST(arr, arr.length);
        BinaryTreeUse.printTree(root);
    }

    public static BinaryTreeNode<Integer> createBST(int[] arr, int n) {
        return helpBST(arr, 0, n - 1);
    }

    private static BinaryTreeNode<Integer> helpBST(int[] arr, int start, int end) {
        if (start > end) return null;

        int mid = start + (end - start) / 2;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = helpBST(arr, start, mid - 1);
        root.right = helpBST(arr, mid + 1, end);
        return root;
    }
}
