package src;
import java.util.*;

public class SortedBST {
    // Creates the nodes
    public static class Node {
        int data;
        Node left = null;
        Node right = null;

        Node(int data) {
            this.data = data;
        }
    }

    // Creates the binary tree
    public static class BinaryTree {
        //
        public Node binarySearchTree(int[] array, int startIndex, int endIndex) {
            int mid;

            if (startIndex > endIndex) {
                return null;
            }

            int[] newArray = Arrays.copyOfRange(array, startIndex, endIndex + 1);

            if (newArray.length > 1) {
                if (newArray.length % 2 == 0) {
                    mid = (startIndex + endIndex) / 2 + 1;
                } else {
                    mid = (startIndex + endIndex) / 2;
                }
            } else {
                mid = (startIndex + endIndex) / 2;
            }

            Node node = new Node(array[mid]);

            node.left = binarySearchTree(array, startIndex, mid - 1);
            node.right = binarySearchTree(array, mid + 1, endIndex);

            return node;
        }
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] array = {1, 2, 13, 14, 25, 26, 37, 48, 59};
        int arrayLength = array.length;

        Node root = tree.binarySearchTree(array, 0, arrayLength - 1);

        System.out.println(root.data);
        System.out.println("----------");
        System.out.println(root.left.data);
        System.out.println(root.left.left.data);
        System.out.println(root.left.right.data);
        System.out.println(root.left.left.left.data);
        System.out.println("----------");
        System.out.println(root.right.data);
        System.out.println(root.right.left.data);
        System.out.println(root.right.right.data);
        System.out.println(root.right.left.left.data);

    }
}
