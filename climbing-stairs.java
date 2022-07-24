// https://leetcode.com/problems/climbing-stairs/submissions/
class Solution {
    public int climbStairs(int n) {
        if(n<=2)
            return n;
        int x = 1,y=2;
        int temp =0;
        for(int i=3;i<n;i++){
            temp = y;
            y= x+y;
            x=temp;
        }
        return (x+y);
    }

}