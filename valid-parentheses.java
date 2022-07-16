//https://leetcode.com/problems/valid-parentheses
class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        char [] ch= new char[len];
        int top=-1;
        if(len<2)
            return false;
        for(int i=0;i<len;i++){
            if((s.charAt(i)==')' ||  s.charAt(i)=='}' || s.charAt(i)==']')                 && top==-1){
               return false;
        }
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                top++;
                ch[top]=s.charAt(i);
               }
            else if(s.charAt(i)==')' && ch[top]=='(')
                top--;
            else if( s.charAt(i)=='}' && ch[top]=='{')
                top--;
            else if(s.charAt(i)==']' && ch[top] == '[')
                top--;
            else 
                return false;
        }
        if(top==-1)
            return true;
        else 
            return false;    
        }
    }
