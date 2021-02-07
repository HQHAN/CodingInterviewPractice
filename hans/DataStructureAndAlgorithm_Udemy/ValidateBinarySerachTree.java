import java.util.List;
import java.util.ArrayList;

public class TreeNode {
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

 class Solution {
   // check this again for 100%
   // https://leetcode.com/submissions/detail/451977012/
   public boolean isValidBST(TreeNode root) {
     return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
   }

   private boolean isValidBST(TreeNode node, long min, long max) {
     if(node == null) return true;

     if(node.val > min && node.val < max) {
       return isValidBST(node.left, min, node.val)
                && isValidBST(node.right, node.val, max);
     }

     return false;
   }
 }
 