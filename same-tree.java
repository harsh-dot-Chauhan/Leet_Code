//https://leetcode.com/problems/same-tree
class Solution {
    List<Integer> l1;
    List<Integer> l2;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        l1=new ArrayList<Integer>();
        l2=new ArrayList<Integer>();
        preorder(p,l1);
        preorder(q,l2);
        if(l1.size() != l2.size())
            return false;
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i)+ "=="+l2.get(i));
            if(!(l1.get(i).equals(l2.get(i))))
                return false;
        }
        return true;
    }
    public void preorder(TreeNode root,List<Integer> list){
        if(root == null)
            return;
        list.add(root.val);
        if(root.left == null && root.right!=null){
            list.add(0);
        }
        else
        preorder(root.left,list);
        if(root.right==null && root.left!=null){
            list.add(0);
        }
        else
        preorder(root.right,list);
        
    }
}