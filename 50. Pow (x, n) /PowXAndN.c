double helper(double x, int n) {

    if (n == 0) return 1;

    if (n % 2 == 0) 
        return helper(x * x, n / 2);
    return x * helper(x * x, n / 2);
}
double myPow(double x, int n) {
    
    if (x == 0) return 0;
    double res = helper(x, n);

    if (n < 0) return 1 / res;
    return res;
}
