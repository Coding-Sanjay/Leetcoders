class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i=0; i<nums.length; i++) {

            if (nums[i] > 0) break;
            
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int aPointer = i + 1;
            int bPointer = nums.length - 1;

            while(aPointer < bPointer) {
                if (nums[aPointer] + nums[bPointer] == -(nums[i])) {
                    List<Integer> innerList = new ArrayList<>();
                    innerList.add(nums[i]);
                    innerList.add(nums[aPointer]);
                    innerList.add(nums[bPointer]);
                    result.add(innerList);
                    aPointer += 1;
                    while (nums[aPointer] == nums[aPointer - 1] && aPointer < bPointer) 
                        aPointer += 1;
                } 
                else if (nums[aPointer] + nums[bPointer] > -(nums[i])) bPointer -= 1;
                else aPointer += 1;
            }
        }

        return result;
    }
}
