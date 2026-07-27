class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i=0;
        int j=0;
        int []ans=new int[nums.length-k+1];
        int idx=0;
        Deque<Integer> q=new LinkedList<>();
        while(j<nums.length){
            if(q.size()==0){
                q.addLast(nums[j]);
            }else{
                while(q.size() > 0 && q.peekLast() < nums[j]){
                    q.removeLast();
                }
                q.add(nums[j]);
            }
            if(j-i+1>k){
                if(nums[i]==q.peek()){
                    q.removeFirst();
                }
                i++;
            }
            if(j-i+1==k){
                ans[idx++]=q.peekFirst();

            }
            j++;
        }
        return ans;
        
    }
}