package q;

import java.util.Scanner;
public class april_25_all6 {
    public static void main(String[] args) {
        //01
        int sum = 0;
        for (int a = 1; a <= 10; a++) {
            int count = 1;
            for (int b = 1; b <= a; b++) {
                count *= b;
            }
            sum += count;
        }
        System.out.println("1! + 2! + ... + 10! 的和为：" + sum);
        // 02
        double sum1 = 0.0 ;
        for (int i = 1; i <= 20; i++) {
            double count1 = 1.0;
            for (int j = 1; j <= i; j++) {
                count1 *= j;
            }
            sum1 += 1/count1;
        }
        System.out.println("1+1/2！+1/3！+1/4！+...的前20项和。"+sum1);
        // 03
        Scanner sc = new Scanner(System.in);
        System.out.println("输入三个整数");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int max = Math.max(n1, Math.max(n2, n3));
        int min = Math.min(n1, Math.min(n2, n3));
        int mid = n1 + n2 + n3 - max - min;
        System.out.println("按非降序排列的三个整数为：");
        System.out.println(min + " " + mid + " " + max);
        // 04
        System.out.print("请输入学生个数：");
        int numberOfStudents = sc.nextInt();

        String highestScorerName = null;
        double highestScore = 0;
        String secondHighestScorerName = null;
        double secondHighestScore = 0;

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("请输入第 " + i + " 个学生的名字：");
            String studentName = sc.nextLine();
            System.out.print("请输入第 " + i + " 个学生的分数：");
            double score = sc.nextDouble();

            if (score > highestScore) {
                secondHighestScorerName = highestScorerName;
                secondHighestScore = highestScore;

                highestScorerName = studentName;
                highestScore = score;
            } else if (score > secondHighestScore) {
                secondHighestScorerName = studentName;
                secondHighestScore = score;
            }
        }

        System.out.println("获得最高分的学生是：" + highestScorerName + "，分数为：" + highestScore);
        System.out.println("获得第二高分的学生是：" + secondHighestScorerName + "，分数为：" + secondHighestScore);

        // 05
            int n = 1;
            while (n * n <= 12000) {
                n++;
            }
            System.out.println("满足 n² > 12000 的最小整数为：" + n);
            // 06
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入一个整数：");
            int number = scanner.nextInt();
            System.out.print("该整数的最小因子为：");
            for (int factor = 2; factor <= number; factor++) {
                while (number % factor == 0) {
                    System.out.print(factor + " ");
                    number /= factor;
                }
            }



        }



    }


