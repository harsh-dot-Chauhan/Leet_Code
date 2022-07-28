//https://leetcode.com/problems/valid-anagram
//Daily Challenge
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sr = s.toCharArray();
        char[] tr= t.toCharArray();
        Arrays.sort(sr);
        Arrays.sort(tr);
        return String.valueOf(sr).equals(String.valueOf(tr));
        
    }
}