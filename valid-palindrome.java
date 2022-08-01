//https://leetcode.com/problems/valid-palindrome
class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        char [] ch = s.toCharArray();
        s ="";
        for(char c: ch){
            if((c>='a' && c<='z') || (c>='A' && c <='Z') || (c>='0' && c<='9'))
                s+=c+"";
        }
        int len = s.length();
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
}