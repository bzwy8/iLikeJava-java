package q;

import java.util.Scanner;
public class qwe {
    public static void main(String[] args) {
        // 01
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数");
         int number = sc.nextInt();
         String a= number % 2 ==0 ? "偶数" : "奇数";
        System.out.println(a);
        // 02
        System.out.println("输入一个整形数字");
        int q = sc.nextInt();
        System.out.println("再输入一个整型数字");
        int w = sc.nextInt();
        int b;
        b = w;
        w = b;
        System.out.println(b);
        System.out.println(w);
        // 03
        System.out.println("随机输入一个年份");
        int year = sc.nextInt();
        String qwe = (year%4==0) &(year%100!=0)|(year%400==0)? "闰年" :"不是闰年";
        System.out.println("该年份为"+qwe);



    }

}
