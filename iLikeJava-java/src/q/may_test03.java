package q;

import java.util.Scanner;

public class may_test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个大于6的偶数: ");
        int number = scanner.nextInt();

        if (number <= 6 || number % 2 != 0) {
            System.out.println("输入的数必须是大于6的偶数");
        } else {
            boolean found = false;
            for (int i = 2; i <= number / 2; i++) {
                if (isPrime(i) && isPrime(number - i)) {
                    System.out.println(number + " = " + i + " + " + (number - i));
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("未找到两个质数的和等于输入的数");
            }
        }
        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

