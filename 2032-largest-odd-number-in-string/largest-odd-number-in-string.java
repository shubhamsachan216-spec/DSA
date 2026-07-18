class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        while(n>0){
            if((num.charAt(n-1)-'0')%2 !=0){
                return num.substring(0,n);
            }else{
                n--;
            }
            
        }
        return "";
    }
}