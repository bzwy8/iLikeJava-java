package q;
public class qiu_3_weishu {
    public static void main(String[] args) {
        int b = 1;
        int sum1 = 0;
        for (int i = 1; i < 10; i++) {
            b *= i;
            int[] d = null;
            if (b > 0 && b < 1000) {
                System.out.println(i);
                int[] c = {b};
                d = new int[]{i};
                sum1 += c[0];
            }
            if (d != null && d[0] * 100 == sum1) {
                // Add your logic here if needed
            }
        }

        // Code to find the three-digit number that equals the sum of the factorials of its digits
        // 查找等于其数字阶乘之和的三位数的代码
        for (int num = 100; num < 1000; num++) {
            if (num == factorialSum(num)) {
                System.out.println("该三位数是: " + num);
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

