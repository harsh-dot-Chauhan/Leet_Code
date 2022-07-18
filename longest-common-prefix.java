//https://leetcode.com/problems/longest-common-prefix
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len =strs.length;
        int minlen=201;
        String s="";
        int flag =0;
        if(len==1){
            return strs[0];
        }
        for(int i=0;i<len;i++){
            if(strs[i].length()<minlen)
                minlen=strs[i].length();
        }
        for(int i=0;i<minlen;i++){
            flag =0;
            for(int j=0;j<len-1;j++){
                if(strs[j].charAt(i)==strs[j+1].charAt(i))
                    flag = 1;
                else {
                    flag = 0;
                    break;
                } 
            }
            if(flag ==1){
                s=s+strs[0].charAt(i);
            }
            else{
                break;
            }   
        }
        
        return s;
    }
}