package q;

import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = scanner.nextInt();
        System.out.println("你输入的整数是：" + number);
        scanner.close();
    }
}
