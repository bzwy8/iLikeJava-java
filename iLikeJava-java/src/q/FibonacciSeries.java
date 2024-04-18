package q;

import java.util.Scanner;

public class FibonacciSeries {
    public static void printFibonacci(int n) {
        int first = 0, second = 1, third;
        System.out.print(first + " " + second);
        for (int i = 2; i < n; i++) {
            third = first + second;
            System.out.print(" " + third);
            first = second;
            second = third;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入需要的斐波那契数列项数：");
        int n = scanner.nextInt();
        printFibonacci(n);
    }
}
