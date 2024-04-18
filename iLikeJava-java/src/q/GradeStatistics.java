package q;

public class GradeStatistics {
    public static double averageWithFor(int[] grades) {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.length;
    }

    public static double averageWithWhile(int[] grades) {
        int total = 0;
        int i = 0;
        while (i < grades.length) {
            total += grades[i];
            i++;
        }
        return (double) total / grades.length;
    }

    public static double averageWithDoWhile(int[] grades) {
        int total = 0;
        int i = 0;
        if (grades.length > 0) {
            do {
                total += grades[i];
                i++;
            } while (i < grades.length);
        }
        return (double) total / grades.length;
    }

    public static void main(String[] args) {
        int[] grades = {88, 92, 79, 93, 85};
        System.out.println("平均成绩（for循环）: " + averageWithFor(grades));
        System.out.println("平均成绩（while循环）: " + averageWithWhile(grades));
        System.out.println("平均成绩（do-while循环）: " + averageWithDoWhile(grades));
    }
}
