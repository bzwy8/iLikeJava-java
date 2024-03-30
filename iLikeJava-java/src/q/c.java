package q;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.sin;

public class c {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // 01作业
        System.out.println("输入一个小写字母");
        String num = sc.next();
        String num1 = num.toUpperCase();
        System.out.println("该小写字母的大写形式为："+num1);
        // 02
        char ni , wo ,ta;
        ni ='你';
        wo ='我';
        ta ='他';
        System.out.println("'你'在Unicode表中的位置是"+ (int)ni );
        System.out.println("'我'在Unicode表中的位置是"+ (int)wo );
        System.out.println("'他'在Unicode表中的位置是"+ (int)ta );
        // 03
        double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, radius;
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("输入边界圆的半径: ");
        radius = inputScanner.nextDouble();
        x1 =radius* Math.cos(PI/2 -(2 * PI/ 5));
        y1 = radius* sin(PI/2-(2 * PI/5));
        x2 = radius* Math.cos(PI/2);
        y2 = radius* sin(PI/ 2);
        x3 =radius* Math.cos(PI/2 + (2* PI/5));
        y3 = radius*Math.sin(Math.PI/2 + (2* PI/ 5));
        x4 =radius*Math.cos(PI/2 +2 *(2* PI/ 5));
        y4 =radius* sin(Math.PI/2+2*(2 * PI/ 5));
        x5 =radius*Math.cos(PI/2-2*(2* PI/ 5));
        y5 =radius*Math.sin(Math.PI/2-2*(2* PI/ 5));
        System.out.println("正五边形上的5个顶点坐标");
        System.out.printf("(%.2f, %.2f}\n", x1, y1);
        System.out.printf("(%.2f, %.2f}\n",x2, y2);
        System.out.printf("(%.2f, %.2f}\n", x3, y3);
        System.out.printf("(%6.2f, %.2f}\n", x4, y4);
        System.out.printf("(%.2f, %.2f}\n", x5, y5);
       //04
        int c ,b;
        double n ,square;
        c = 6;
        b = 4;
        n = 0.57735026918963;
        System.out.println("输出边长长度");
        int s = sc.nextInt();
        square = (c*s*s/b*n);
        System.out.println("六边形面积为:"+square);
       //05
        System.out.println("输入一个十进制数字:");
        int ten = sc.nextInt();
        String two = Integer.toBinaryString(ten);
        System.out.println(two);
        // 06
        /*System.out.println("输入一个十六进制数:");
        String number2 = sc.next();
        int g;
        try{
            g=Integer.parseInt(number2,16);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(number2+"不是一个有效的十六进制数");
            g = 0;
            return;}
            System.out.println(Integer.toBinaryString(g));
            f*/
        // 07
        System.out.println("请输入您的用户名");
        String name = sc.next();
        System.out.println("输入你的密码");
        String password = sc.next();
        System.out.println("再次输入你的密码");
        String password2 = sc.next();
        String qwe = (name.length()>=3)  ? "用户名输入没有错误" :"用户名输入有错误" ;
        String qaq = (password.length()>=6 ) && (password == password2) ? "密码输入没有错误" : "第密码输入有错误" ;
        System.out.println(qwe);
        System.out.println(qaq);
        // 08
        for (int i = 0x391; i <= 0x3FF; i++) {
            char cc = (char) i;
            System.out.print(cc);
        }
        //09
            for (int i = 2; i <= 100; i++) {
                    boolean isPrime = true;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.println(i);
                    }
                }
        //010
        int j , k ,l;
        j = 12 ;
        k = 5 ;
        l = 3 ;
        System.out.println(j+k+l+"||"+(j-k<7));



    }
}
