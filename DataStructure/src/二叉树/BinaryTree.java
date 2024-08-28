package 二叉树;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    static class TreeNode {
        public char val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return val + " ";
        }
    }


    public TreeNode root;//将来这个引用指向根节点


    public TreeNode createTree() {
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');

        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;

        return A;
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public List<TreeNode> preOrder2(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        list.add(root);

        List<TreeNode> leftList = preOrder2(root.left);
        list.addAll(leftList);

        List<TreeNode> rightList = preOrder2(root.right);
        list.addAll(rightList);

        return list;
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    public int nodeSize(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return nodeSize(root.left) + nodeSize(root.right) + 1;
    }

    public int getLeftSize(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null && root.right == null) {
            return 1;
        }

        return getLeftSize(root.left) + getLeftSize(root.right);
    }

    public int getKLevelNodeCount(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }

        if (k == 1) {
            return 1;
        }

        return getKLevelNodeCount(root.left, k-1) +
                getKLevelNodeCount(root.right, k-1);
    }

    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public boolean find(TreeNode root, char key) {
        if (root == null) {
            return false;
        }

        if (root.val == key) {
            return true;
        }

        if(find(root.left, key) == true || find(root.right, key) == true) {
            return true;
        }

        return false;
    }
}
