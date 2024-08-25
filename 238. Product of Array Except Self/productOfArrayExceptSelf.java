class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] prefixProduct = new int[n];
        int[] suffixProduct = new int[n];

        int prefix = 1;
        for (int i = 0; i < n; i++) {
            prefixProduct[i] = prefix;
            prefix *= nums[i];
        } 

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            suffixProduct[i] = suffix;
            suffix *= nums[i];
        }

        for (int i = 0; i < n; i++) 
        nums[i] = prefixProduct[i] * suffixProduct[i];

        return nums;
    }
}

// Without using an Array
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];

        int prefix = 1;

        for (int i=0; i<nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        int postfix = 1;

        for (int i=nums.length-1; i>=0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }

        return result;
    }
}
