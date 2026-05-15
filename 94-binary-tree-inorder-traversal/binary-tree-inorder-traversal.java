class Solution {
    List<Integer> inorderTraverse(TreeNode root,List<Integer> list) {

        if(root==null)
            return list;
        inorderTraverse(root.left,list);
        list.add(root.val);
        inorderTraverse(root.right,list);
        return list;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        list = inorderTraverse(root,list);
        return list;
    }
}