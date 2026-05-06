class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        String ans = "";

        // Remove extra spaces
        s = s.trim();

        // Split words
        String[] words = s.split("\\s+");

        // Reverse order of words
        for (int i = words.length - 1; i >= 0; i--) {
            ans += words[i];

            if (i != 0) {
                ans += " ";
            }
        }

        return ans;
    }
}