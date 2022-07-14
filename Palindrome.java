//https://leetcode.com/problems/palindrome-number/
class Solution {
    public boolean isPalindrome(int x) {
        String st = x +"";
        StringBuffer str =new StringBuffer(st);
        String s= str.reverse()+"";
        if(s.equals(st))
            return true;
        else
            return false;
        
    }
}