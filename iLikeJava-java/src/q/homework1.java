package q;
import java.util.Scanner;
public class homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 01
        System.out.println("输入任意数字");
        int number = sc.nextInt();
        if (number%5==0 && number%6==0){
            System.out.println("能被5和6整除");
        } else if (number%5==0) {
            System.out.println("能被5整除");
        } else if (number%6==0) {
            System.out.println("能被6整除");
        }else {
            System.out.println("不能被5和6整除");
        // 02
            System.out.println("输入一个1-100之间的数字");
            int a = sc.nextInt();
            if (a>=1 & a<=100){
                if (a>90 & a<100){
                    System.out.println("A");
                } else if (a>80&a<89) {
                    System.out.println("B");
                } else if (a>70 & a<79) {
                    System.out.println("C");
                } else if (a>60 & a<69) {
                    System.out.println("D");
                } else if (a<60) {
                    System.out.println("E");
                }
            }else {
                System.out.println("输入数字无效");
            }
            //03
            System.out.println("输入第一个数字");
            int b =sc.nextInt();
            System.out.println("输入第二个数字");
            int c =sc.nextInt();
            System.out.println("输入第三个数字");
            int d =sc.nextInt();
            int temp;
            if (b>c){
                temp = b;
                b = c ;
                c = temp;
            }
            if (b>d){
                temp = b;
                b = d ;
                d = temp;
            }
            if (c > d) {
                temp = c;
                c = d;
                d = temp;
            }
            System.out.println("从小到大的顺序为：" + b + ", " + c + ", " + d);
            // 04
            System.out.println("输入年份");
            int year = sc.nextInt();
            System.out.println("输入月份");
            int month = sc.nextInt();
            if ((year%4==0) &(year%100!=0)|(year%400==0)){
                System.out.println(year+ "该年份为闰年");
                switch (month){
                    case 1 , 3 ,5 ,7 , 8, 10 ,12 :
                        System.out.println("有31天");
                        break;
                    case 2 :
                        System.out.println("有29天");
                        break;
                    case 4 , 6 , 9 ,11 :
                        System.out.println("有30天");
                        break;
                }
            }else{
                System.out.println(year+ "该年份不是闰年");
                switch (month){
                    case 1 , 3 ,5 ,7 , 8, 10 ,12 :
                        System.out.println("有31天");
                        break;
                    case 2 :
                        System.out.println("有28天");
                        break;
                    case 4 , 6 , 9 ,11 :
                        System.out.println("有30天");
                        break;
                }
            }

            }

    }
}
