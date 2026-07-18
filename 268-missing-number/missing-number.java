class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int sum2 = 0;
        for(int i=1;i<=nums.length;i++){
            sum2 += i;
        }
        int ans = sum2 - sum;
        return ans;
    }
}