//https://leetcode.com/problems/length-of-last-word/submissions/
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String []str = s.split(" ");
        return str[str.length-1].length();
        
    }
}