class Solution {
    public static void main(String[] args) {
        int[] nums={3,0,1};
        System.out.println(new Solution().missingNumber(nums));
    }
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int osum=(nums.length*(nums.length+1))/2;
        return osum-sum;
    }
}