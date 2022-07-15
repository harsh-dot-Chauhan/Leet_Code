//https://leetcode.com/problems/remove-element/
class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==val){
                count++;
                for(int j=i;j<nums.length-1;j++){
                    nums[j]=nums[j+1];
                }
            }
        }
        return nums.length-count;
    }
}