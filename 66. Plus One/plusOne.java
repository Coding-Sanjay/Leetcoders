class Solution {
    public int[] plusOne(int[] digits) {
        
        int n = digits.length;

        if (digits[n - 1] < 9) {
            digits[n - 1] += 1;
            return digits;
        }

        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            int val = digits[i] + carry;
            digits[i] = (val > 9) ? val % 10 : val;
            carry = val / 10;
        }

        if (carry != 0) {
            int[] res = new int[n + 1];

            res[0] = carry;
            for (int i = 0; i < n; i++) res[i + 1] = digits[i];

            return res;
        }

        return digits;
    }
}
