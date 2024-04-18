package q;

import com.sun.nio.sctp.SctpStandardSocketOptions;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class april_25 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "小明";
        student1.Subject = new String[]{"Math","Chinese","Sport","English","IT"};
        student1.score = new int[]{145,120,133,124,125};
        Student student2 = new Student();
        student2.name = "小黑";
        student2.Subject = new String[]{"Math","Chinese","Sport","English","IT"};
        student2.score = new int[]{130,110,133,140,125};
        Student student3 = new Student();
        student3.name = "小白";
        student3.Subject = new String[]{"Math","Chinese","Sport","English","IT"};
        student3.score = new int[]{145,100,130,124,125};
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你想查阅学生:小明，小黑，小白");
        String input = scanner.nextLine();
        int AllScore1,AllScore2,AllScore3;
        AllScore1 =student1.score[0]+student1.score[1]+student1.score[2]+student1.score[3]+student1.score[4];
        AllScore2 = student2.score[0]+student2.score[1]+student2.score[2]+student2.score[3]+student2.score[4];
        AllScore3 = student3.score[0]+student3.score[1]+student3.score[2]+student3.score[3]+student3.score[4];
        if (Objects.equals(input, student1.name)){
            System.out.println(Arrays.toString(student1.Subject) + "\n" + Arrays.toString(student1.score));
            int scoreMAX1 = 145;
            int scoreMIN1 = 120;

            int averageScore1 = AllScore1/5;
            System.out.println("最高分:"+scoreMAX1);
            System.out.println("最低分:"+scoreMIN1);
            System.out.println("平均分:"+averageScore1);
            System.out.println("总分:"+AllScore1);

        } else if (Objects.equals(input, student2.name)) {
            System.out.println(Arrays.toString(student2.Subject) + "\n" + Arrays.toString(student2.score));
            int scoreMAX2 = 140;
            int scoreMIN2 = 110;

            int averageScore2 = AllScore2/5;
            System.out.println("最高分:"+scoreMAX2);
            System.out.println("最低分:"+scoreMIN2);
            System.out.println("平均分:"+averageScore2);
            System.out.println("总分:"+AllScore2);

        } else if (Objects.equals(input, student3.name)) {
            System.out.println(Arrays.toString(student3.Subject) + "\n" + Arrays.toString(student3.score));
            int scoreMAX3 = 130;
            int scoreMIN3 = 100;

            int averageScore3 = AllScore3/5;
            System.out.println("最高分:"+scoreMAX3);
            System.out.println("最低分:"+scoreMIN3);
            System.out.println("平均分:"+averageScore3);
            System.out.println("总分:"+AllScore3);

        }else {
            System.out.println("不好意思没有找到此同学");
        }
        int classMaxScore = student1.score[0];
        int classMinScore = student3.score[1];
        int classAllScore = AllScore1 + AllScore2 + AllScore3;
        int classAverageScore = classAllScore/15;
        System.out.println("班级最高分:"+classMaxScore);
        System.out.println("班级最低分:"+classMinScore);
        System.out.println("班级总分·:"+classAllScore);
        System.out.println("班级平均分:"+classAverageScore);


    }
}
class Student {
    String name ;
    String [] Subject ;
    int [] score;
        }