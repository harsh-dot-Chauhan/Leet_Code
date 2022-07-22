//https://leetcode.com/problems/sqrtx/submissions/
class Solution {
    public int mySqrt(int x) {
        if(x==0)
            return 0;
        
        double res=1;
        if(x>900000000){
            res=30000;
        }
        while((res*res) <=x){
            if(res*res == x){
                System.out.println(res);
                return (int)res;
            }
            res ++;
            
        }
        System.out.println("2. "+res);
        return (int)res-1;
    }
}