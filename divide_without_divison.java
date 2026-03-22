public class divide_without_divison {
    public static int main(String[] args) {
        int dividend=-2147483648;
        int divisor=-1;
        
        int q = 0;
        if (dividend == 0) {
            q = 0;

        }

        int sign = 1;
        if (dividend < 0 && divisor > 0) {
            sign = -1;
        }

        if (divisor < 0 && dividend > 0) {
            sign = -1;
        }
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);

        while (a >= b) {
            a = a - b;
            q++;
        }
        q = q * sign;

        if (q >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (q <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return q;
        }
    }

}
