import BinaryTreeNode;
import java.util.Scanner;

public class BinaryTreeUse {
    public void printTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        String toBePrinted = root.data + "";
        if (root.left != null) {
            toBePrinted += "L:" + root.left.data + ",";
        }
        if (root.right != null) {
            toBePrinted += "R:" + root.right.data;
        }
        System.out.println(toBePrinted);
    }

    public BinaryTreeNode<Integer> takeInput(Scanner s) {
        int rootData;
        System.out.println("Enter the root data: ");
        rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        System.out.println("Enter left child of " + rootData);
        root.left = takeInput(s);
        System.out.println("Enter right child of " + rootData);
        root.right = takeInput(s);
        return root;
    }

    public static void main(String[] args) {
        BinaryTreeUse treeUse = new BinaryTreeUse();
        Scanner scanner = new Scanner(System.in);
        BinaryTreeNode<Integer> root = treeUse.takeInput(scanner);
        treeUse.printTree(root);
        scanner.close();
    }
}
