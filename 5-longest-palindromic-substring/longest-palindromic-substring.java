class Solution {
    boolean ispalindrome(String s ,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        String res="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(ispalindrome(s,i,j)){
                    if((j-i+1)>res.length()){
                        res=s.substring(i,j+1);
                    }
                }
            }

        }
        return res;

        
    }
}