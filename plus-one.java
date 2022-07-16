//https://leetcode.com/problems/plus-one/
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int carry=0;
        long sum = 0;
        if(digits[len-1] !=9)
        {   digits[len-1]+=1;
            return digits;
        }
        else{
            digits[len-1]=0;
            carry = 1;
            for(int i=len-2;i>=0;i--){
                if(digits[i]+carry==10){
                    digits[i]=0;
                    carry = 1;
                }
            else{
                digits[i]+=carry;
                carry = 0;
                break;
            }
            }
            if(carry==1){
                int arr[]=new int[len+1];
                arr[0]=1;
                for(int i=0;i<len;i++){
                    arr[i+1]=digits[i];
                }
                return arr;
            }
            return digits; 
        }   
    }
}