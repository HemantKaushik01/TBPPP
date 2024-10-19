class Solution {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(new Solution().singleNumber(nums));
    }
    public int singleNumber(int[] nums) {
        int ans=0; 
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];  
        }
        return ans;    
    }
}