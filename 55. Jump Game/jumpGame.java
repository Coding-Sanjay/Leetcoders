class Solution {
    public boolean canJump(int[] nums) {
        
        if (nums.length == 1) return true;
        if (nums[0] == 0) return false;
        int n = nums.length - 1;  
        int maxCoverage = 0;

        for (int i = 0; i < n; i++) {
            if (maxCoverage == i && nums[i] == 0) return false;
            maxCoverage = Math.max(maxCoverage, nums[i] + i);
        }

        if (maxCoverage >= n) return true;

        return false;
    }
}
 
