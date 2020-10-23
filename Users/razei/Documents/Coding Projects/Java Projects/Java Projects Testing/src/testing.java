import java.util.*;

public class testing {
    public static class Node {
        char data;
        Node left = null;
        Node right = null;

        Node(char data) {
            this.data = data;
        }
    }

    public static void tree(int[] array) {
        int arrayLength = array.length;
        System.out.println(arrayLength);
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 13, 14, 25, 26, 37, 48, 59};

        tree(array);
    }
}
