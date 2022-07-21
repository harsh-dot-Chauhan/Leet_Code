//https://leetcode.com/problems/add-binary/
class Solution {
    public String addBinary(String a, String b) {
        String result ="";
        String  carry="0";
        if(a.length()==b.length()){
            for(int i=a.length()-1;i>=0;i--){
                if(a.charAt(i)==b.charAt(i) && b.charAt(i)=='0' && carry.equals("0")){
                    result = "0" + result;
                }
                else if(a.charAt(i)==b.charAt(i) && b.charAt(i)=='1' && carry.equals("0")){
                    result = "0" + result;
                    carry = "1";
                }
                else if(a.charAt(i)==b.charAt(i) && b.charAt(i)=='0' && carry.equals("1")){
                    result = "1" + result;
                    carry = "0";
                }
                else if(a.charAt(i)==b.charAt(i) && b.charAt(i)=='1' && carry.equals("1")){
                    result = "1" + result;
                    carry = "1";
                }
                else if(carry.equals("0")){
                    result = "1" + result;
                }
                else if(carry.equals("1")){
                    result = "0" + result;
                    carry = "1";
                }
            }
            
        }
        if(carry.equals("1")){
            result = carry + result;
        }
        return result;
        
    }
}