package q;

import java.util.Scanner;

public class yyyy {
    public static void main(String[] args) {
        // 01
        int a = 89;
        int b = 24;
        System.out.println("89小时是"+a/b+"天零"+a%b+"小时");
        // 02
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number1 = scanner.nextInt();
        System.out.println("再输入一个整数：");
        int number2 =  scanner.nextInt();
        System.out.println("两数相加结果："+(number1+number2));
        System.out.println("两数相减结果："+(number1-number2));
        System.out.println("两数相除结果："+(number1/number2));
        System.out.println("两数取余结果："+(number1%number2));
        // 03
        int i,j,n,m;
        i = 100;
        j = 7;
        m= 2;
        n = i % j;
        System.out.println("今天是周二，100天以后是周"+(m+n));






    }
}
