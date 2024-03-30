package q;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class asd {
    public static void main(String[] args) {
        // 获取今天的日期
        LocalDate today = LocalDate.now();
        // 计算100天后的日期
        LocalDate futureDate = today.plusDays(100);
        // 获取100天后是星期几
        DayOfWeek dayOfWeek = futureDate.getDayOfWeek();
        // 输出结果
        System.out.println("今天是周二，100天以后是周" + dayOfWeek);
    }
}


