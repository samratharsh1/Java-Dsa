public class qq {

    public static void main(String[] args) {
        System.out.println(multiply("6913259244","71103343"));
    }
    public static String multiply(String num1, String num2) {
        long q = num(num1) * num(num2);
        return String.valueOf(q);
    }

    public static long num(String n) {
        long res = 0;
        for (int i = 0; i < n.length(); i++) {
            res += no(n.charAt(i)) * Math.pow(10, n.length() - i - 1);
        }
        return res;
    }

    public static int no(char num) {
        if (num == '-') return -1;
        switch(num) {
            case '0': return 0;
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            default: return 0;
        }
    }
}
