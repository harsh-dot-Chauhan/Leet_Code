//https://leetcode.com/problems/symmetric-tree
class Solution {
    List<Integer> left;
    List<Integer> right;
    public boolean isSymmetric(TreeNode root) {
        if(root.left == null && root.right==null)
            return true;
        
        left = new ArrayList<Integer>();
        right = new ArrayList<Integer>();
        preleft(root.left);
        preRight(root.right);
        if(left.size()!=right.size())
            return false;
        for(int i=0;i<left.size();i++){
            if(left.get(i)!=right.get(i)){
                return false;
            }
        }
        return true;
        
    }
    public void preleft(TreeNode root){
        if(root == null)
            return;
        left.add(root.val);
        if(root.left==null)
            left.add(0);
        else
        preleft(root.left);
        if(root.right == null)
            left.add(0);
        else
        preleft(root.right);
    }
    public void preRight(TreeNode root){
        if(root == null)
            return;
        right.add(root.val);
        if(root.right == null)
            right.add(0);
        else
        preRight(root.right);
        if(root.left==null)
            right.add(0);
        else
        preRight(root.left);
    }
}