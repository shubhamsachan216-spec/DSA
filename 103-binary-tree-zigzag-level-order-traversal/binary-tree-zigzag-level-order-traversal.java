class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<TreeNode> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        q.offer(root);
        boolean reverse = false;

        while (!q.isEmpty()) {

            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode curr = q.poll();

                if (reverse) {
                    st.push(curr.val);
                } else {
                    level.add(curr.val);
                }

                if (curr.left != null)
                    q.offer(curr.left);

                if (curr.right != null)
                    q.offer(curr.right);
            }

            if (reverse) {
                while (!st.isEmpty()) {
                    level.add(st.pop());
                }
            }

            ans.add(level);
            reverse = !reverse;
        }

        return ans;
    }
}