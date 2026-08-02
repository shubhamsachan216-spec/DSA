class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        char[] first=strs[0].toCharArray();
        char[] end=strs[strs.length-1].toCharArray();
        StringBuilder ans=new StringBuilder();
        int len = Math.min(first.length, end.length);
        for(int i=0;i<len;i++){
            if(first[i]!=end[i]){
                break;
            }
            ans.append(first[i]);
        }
        return ans.toString();
        
    }
}