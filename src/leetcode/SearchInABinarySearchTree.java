package leetcode;

public class SearchInABinarySearchTree {
    public static TreeNode searchBST(TreeNode root, int val) {

        TreeNode treeNode = null;

        while (root != null) {
            if (root.val == val) {
                treeNode = root;
                break;
            } else if (root.val < val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }

        return treeNode;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
//        4,2,7,1,3
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(2, treeNode4, treeNode5);
        TreeNode treeNode3 = new TreeNode(7);

        TreeNode treeNode1 = new TreeNode(4, treeNode2, treeNode3);

        System.out.println(searchBST(treeNode1, 5));
    }
}
