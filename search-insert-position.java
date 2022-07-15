//https://leetcode.com/problems/search-insert-position/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        if(nums[nums.length-1]<target){
            return nums.length;
        }
        while(nums[i]<=target ){
            if(nums[i]==target){
                break;
            }
            else
                i++;
        }
        return i;
        }
}