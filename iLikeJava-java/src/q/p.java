package q;

public class p {
    public static void main(String[] args) {

        // 需求3：找3个整数中的较大值。
        int i = 10;
        int j = 45;
        int k = 34;

        // 找出2个整数中的较大值。
        int temp = i > j ? i : j;
        // 找出temp与k中的较大值。
        int max2 = temp > k ? temp : k;
        System.out.println(max2);

        System.out.println(10 > 3 || 10 > 3 && 10 < 3); // true
        System.out.println((10 > 3 || 10 > 3) && 10 < 3); // false
        System.out.println("------------------------------------------------");

    }
}
