package q;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class day1_7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("输入1到7任意数字");
        int day = sc.nextInt();
        if (day==1||day==3||day==5){
            System.out.println("校内吃");
        }else if (day==2||day==4||day==6) {
            System.out.println("出去吃");
        } else if (day==7) {
            System.out.println("点外卖");
        } else {
            System.out.println("只能输出1-7");
        }
        switch (day){
            case 1:
            case 3:
            case 5:
                System.out.println("i like you my girl");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("i really like you");
                break;
            case 7 :
                System.out.println("i miss you");
            default:
                System.out.println("fuck you bitch***");

        }

    }


}
