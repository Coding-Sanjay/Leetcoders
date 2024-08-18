class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        arr = [0] * 3

        for i in range(len(nums)):
            arr[nums[i]] += 1

        idx = 0

        for i in range(3):
            val = arr[i]

            while (val > 0):
                nums[idx] = i
                val -= 1
                idx += 1

        
