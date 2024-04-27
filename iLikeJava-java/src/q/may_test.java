package q;

public class may_test {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (i == factorialSum(i)) {
                System.out.println("该三位数是: " + i);
            }
        }
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialSum(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum;
    }
}

