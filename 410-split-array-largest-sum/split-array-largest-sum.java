class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        for(int largest :nums){
            low=Math.max(low,largest);
            high+=largest;
        }
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            if(islargest(nums,k,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    boolean islargest(int[] nums,int k,int max){
        int sum=1;
        int curr=0;
        for(int largest :nums){
            if(curr+largest<=max){
                curr+=largest;

            }else{
                sum++;
                curr=largest;
            }
        }
        return sum<=k;
    }
}