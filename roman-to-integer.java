//https://leetcode.com/problems/roman-to-integer
class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int num =0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='I'){
                if(i<len-1 && s.charAt(i+1)=='V'){
                    num +=4;
                    i++;
                }
                else if(i<len-1 && s.charAt(i+1)=='X' ){
                    num +=9;
                    i++;
                }
                else{
                    num +=1;
                }
            }
            else if(s.charAt(i)=='X'){
                if(i<len-1 && s.charAt(i+1)=='L' ){
                    num += 40;
                    i++;
                }
                else if(i<len-1 && s.charAt(i+1)=='C'){
                    num += 90;
                    i++;
                }
                else
                    num +=10;
            }
            else if(s.charAt(i)=='C'){
                if(i<len-1 && s.charAt(i+1)=='D' ){
                    num +=400;
                    i++;
                }
                else if(i<len-1 && s.charAt(i+1)=='M'){
                    num += 900;
                    i++;
                }
                else
                    num +=100;
            }
            else if(s.charAt(i)=='V'){
                num +=5;
            }
            else if(s.charAt(i)=='L'){
                num += 50;
            }
           
            else if(s.charAt(i)=='D'){
                num += 500;
            }
            else if(s.charAt(i)=='M'){
                num +=1000;
            }
        }
        return num;
    }
}