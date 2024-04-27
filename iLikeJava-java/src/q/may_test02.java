package q;

public class may_test02 {
    public static void main(String[] args) {
        int limit = 3000;
        int count = 0;

        for (int a = 1; a < limit; a++) {
            int b = sumOfDivisors(a);
            if (b > a && b < limit && sumOfDivisors(b) == a) {
                System.out.println(a + " 和 " + b + " 是一对亲密数");
                count++;
            }
        }

        System.out.println("3000以内的亲密数对总共有: " + count + " 对");
    }

    public static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
