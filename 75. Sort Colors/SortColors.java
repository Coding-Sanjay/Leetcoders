class Solution {
    public void sortColors(int[] nums) {
        
        int[] arr = new int[3];

        for (int i=0; i<nums.length; i++) {
            arr[nums[i]] += 1;
        }

        int idx = 0;
        for (int i=0; i<3; i++){
            int val = arr[i];

            while (val > 0) {
                nums[idx++] = i;
                val -= 1;
            }
        }
    }
}
