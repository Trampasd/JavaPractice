package 二叉树;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.preOrder(binaryTree.createTree());
        System.out.println();
        binaryTree.inOrder(binaryTree.createTree());
        System.out.println();
        binaryTree.postOrder(binaryTree.createTree());

        System.out.println();

        List<BinaryTree.TreeNode> list = binaryTree.preOrder2(binaryTree.createTree());

        for (BinaryTree.TreeNode t : list) {
            System.out.print(t.val + " ");
        }

        System.out.println();

        System.out.println(binaryTree.find(binaryTree.createTree(), ''));
    }
}
