package binary_search_tree;

import binary_tree.BinaryTreeNode;

public class BST {
    private BinaryTreeNode<Integer> root;
    private int size;

    private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int x){
        if (node == null) return false;

        if (node.data == x){
            return true;
        }

        if (node.data < x){
            return isPresentHelper(node.right, x);
        } else {
            return isPresentHelper(node.left, x);
        }
    }

    public boolean isPresent(int x){
        return isPresentHelper(root, x);
    }

    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int x){
        if (node == null){
            BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(x);
            return newNode;
        }

        if (x >= node.data){
            node.right = insertHelper(node.right, x);
        } else {
            node.left = insertHelper(node.left, x);
        }
        return node;
    }

    public void insert(int x){
        root = insertHelper(root, x);
        size++;
    }

    private static int minimum(BinaryTreeNode<Integer> root){
        if (root == null){
            return Integer.MAX_VALUE;
        }

        int minLeft = minimum(root.left);
        int minRight = minimum(root.right);
        return Math.min(root.data, Math.min(minLeft, minRight));
    }

    private static BSTDeleteReturn deleteHelper(BinaryTreeNode<Integer> root, int x){
        if (root == null){
            return new BSTDeleteReturn(null, false);
        }

        if (root.data < x){
            BSTDeleteReturn outputRight = deleteHelper(root.right, x);
            root.right = outputRight.root;
            outputRight.root = root;
            return outputRight;
        }

        if (root.data > x){
            BSTDeleteReturn outputLeft = deleteHelper(root.left, x);
            root.left = outputLeft.root;
            outputLeft.root = root;
            return outputLeft;
        }

        // 0 children
        if (root.left == null && root.right == null){
            return new BSTDeleteReturn(null, true);
        }
        // only left child
        if (root.left != null && root.right == null){
            return new BSTDeleteReturn(root.left, true);
        }
        // only right child
        if (root.left == null){
            return new BSTDeleteReturn(root.right, true);
        }
        // both children are present
        int rightMax = minimum(root.right);
        root.data = rightMax;
        BSTDeleteReturn outputRight = deleteHelper(root.right, rightMax);
        root.right = outputRight.root;
        return new BSTDeleteReturn(root, true);
    }

    public boolean deleteData(int x){
        BSTDeleteReturn output = deleteHelper(root, x);
        root = output.root;

        if (output.deleted) size--;

        return output.deleted;
    }

    public int size(){
        return size;
    }

    private static void printTreeHelper(BinaryTreeNode<Integer> node){
        if (node == null) return;

        System.out.print(node.data + ":");
        if (node.left != null){
            System.out.print("L" + node.left.data + " ");
        }
        if (node.right != null){
            System.out.print("R" + node.right.data + " ");
        }
        System.out.println();

        printTreeHelper(node.left);
        printTreeHelper(node.right);
    }

    public void printTree(){
        printTreeHelper(root);
    }
}
