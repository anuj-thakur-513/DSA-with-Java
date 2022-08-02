package binary_search_tree;

import binary_tree.BinaryTreeNode;

public class BSTDeleteReturn {
    BinaryTreeNode<Integer> root;
    boolean deleted;

    public BSTDeleteReturn(BinaryTreeNode<Integer> root, boolean deleted) {
        this.root = root;
        this.deleted = deleted;
    }
}
