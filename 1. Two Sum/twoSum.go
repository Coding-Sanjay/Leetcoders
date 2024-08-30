func twoSum(nums []int, target int) []int {
    
    m := map[int]int{}

    for i := 0; i < len(nums); i++ {
        diff := target - nums[i]

        val, ok := m[diff]
        if ok {
            return []int {i, val}
        }
        m[nums[i]] = i;
    }

    return []int {}
}
