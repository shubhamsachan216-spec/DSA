class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int jump=0;
        int maxreach=0;
        int current=0;
        for(int i=0;i<n-1;i++){
            maxreach=Math.max(maxreach,i+nums[i]);
            if(i==current){
            jump ++;
            current=maxreach;
        }
        
        }
        return jump;
        
    }
}