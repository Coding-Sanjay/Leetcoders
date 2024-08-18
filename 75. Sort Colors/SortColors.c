void sortColors(int* nums, int numsSize) {

    int arr[] = {0, 0, 0};

    for (int i = 0; i < numsSize; i++) 
        arr[nums[i]] += 1;

    int idx = 0;
    for (int i = 0; i < 3; i++) {
        int val = arr[i];

        while (val > 0) {
            nums[idx] = i;
            val -= 1;
            idx += 1;
        }
    }
}
