package q;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class may_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 01
        System.out.println("输入一个整数");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(number+"的所有因子是"+ i);
            }
        }
        // 02
        System.out.println("输入一个整数");
        int number2 = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number2; i++) {
            sum += i;
        }
        System.out.println(sum);
        // 03
        System.out.println("输入一个整数");
        int number3 = sc.nextInt();
        int a = 10;
        if (number3 < a) {
            System.out.println( number3+ "是个位数");
        } else if (number3 >= a && number3 < a*a) {
            System.out.println( number3+ "是十位数");
        }
        // 04

            }
        }




       











