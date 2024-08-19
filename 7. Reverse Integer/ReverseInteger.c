int reverse(int x){
    // Limit variable.
    int negLimit = -2147483647;
    int posLimit = 2147483647;
    
    // overflow integer.
    if (x < negLimit || x > posLimit) return 0;

    // result variable.
    long res = 0;

    // reverse loop.
    while (x != 0) {
        int rem = x % 10;
        res = (res * 10) + rem;
        x /= 10;
    }

    // overflow integer.
    if (res < negLimit || res > posLimit) return 0;
    return res;
}

