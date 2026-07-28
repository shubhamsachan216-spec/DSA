class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return solve(nums,goal)- solve(nums,goal-1);
        
    }
    public int solve(int[] nums,int goal){
        int i=0;
        int j=0;
        int sum=0;
        int count=0;
        if(goal<0){
            return 0;
        }
        while(j<nums.length){
            sum+=nums[j];
            while(sum>goal){
                sum-=nums[i];
                i++;
            }
            count+=j-i+1;
            j++;
        }
        return count;
    }
}