class Solution {
    public int reverse(int x) {
        int r = 0; 
        long result = 0;
        boolean flag = false;
        int len = 0;
        // -2147483648 to 2147483647
            if(x < 0) {
                flag = true;
                x = -x;
            }

            while(x > 0) {
                r = x % 10;
                result = result * 10 + r;
                x = x / 10;
                len++;
            }

        if (-2147483648 > result || 2147483647 < result)
            return 0;
        if (flag)
            return (int)-result;
        return (int)result;
    }
}
