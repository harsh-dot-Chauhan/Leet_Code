//https://leetcode.com/problems/implement-strstr
class Solution {
    public int strStr(String haystack, String needle) {
        int index=-1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int k=0;
            for(int j=i;j<i+needle.length();j++){
                if(haystack.charAt(j)==needle.charAt(k)){
                    k++;
                }
                if(k==needle.length()){
                    index =i;
                    break;
                }     
            }
            if(k==needle.length())
                    break;
        }
        return index;
    }
}
