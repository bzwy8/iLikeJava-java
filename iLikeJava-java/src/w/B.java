package w;


public class B {
    // 整型属性 num
    int num;

    // 构造方法初始化 num
    public B(int num) {
        this.num = num;
    }

    // 方法 f() 改变传入对象的 num 属性值
    public void f(B b) {
        b.num = 20; // 将 num 值修改为 20
    }

    // 主方法用于测试
    public static void main(String[] args) {
        // 创建一个 B 对象，初始化 num 为 10
        B b = new B(10);

        // 输出原始的 num 值
        System.out.println("输出原始的 num 值: " + b.num);

        // 调用 f() 方法修改 b 对象的 num 值
        b.f(b);

        // 输出修改后的 num 值
        System.out.println("输出修改后的 num 值: " + b.num);
    }
}

