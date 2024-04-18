package q;
import java.util.Scanner;
public class ZodiacFinder {
    
        // 01
        public static String getZodiac(int year) {
            String[] zodiacs = {"猴", "鸡", "狗", "猪", "鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊"};
            return zodiacs[(year - 1900) % 12];
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入您的出生年份：");
            int year = scanner.nextInt();
            String zodiac = getZodiac(year);
            System.out.println("您的生肖是：" + zodiac);
        }
        }
    

