package w;

// 圆类 (Circle)
class Circle {
    // 属性: 圆半径 radius
    double radius;

    // 常量: PI
    final double PI = 3.14159;

    // 构造方法
    Circle(double radius) {
        this.radius = radius;
    }

    // 求面积方法 area()
    double area() {
        return PI * radius * radius;
    }

    // 求周长方法 perimeter()
    double perimeter() {
        return 2 * PI * radius;
    }
}

// 主类 (Text1)
public class Text1 {
    public static void main(String[] args) {
        // 创建圆类的对象 c1 和 c2 并初始化，c1 的半径为 100，c2 的半径为 200
        Circle c1 = new Circle(100);
        Circle c2 = new Circle(200);

        // 输出 c1 的面积和周长
        System.out.println("圆 c1 的面积: " + c1.area());
        System.out.println("圆 c1 的周长: " + c1.perimeter());

        // 输出 c2 的面积和周长
        System.out.println("圆 c2 的面积: " + c2.area());
        System.out.println("圆 c2 的周长: " + c2.perimeter());
    }
}

