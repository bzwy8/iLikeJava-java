package w;

public class A {
    // 静态变量 count 用于记录类 A 对象的个数
    private static int count = 0;

    // 构造方法，每创建一个对象，count 加 1
    public A() {
        count++;
    }

    // 静态方法输出当前对象个数
    public static void printCount() {
        System.out.println("A 对象的数量为: " + count);
    }

    // 主方法用于测试
    public static void main(String[] args) {
        // 创建一些 A 对象
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();

        // 调用静态方法输出对象个数
        A.printCount();
    }
}

