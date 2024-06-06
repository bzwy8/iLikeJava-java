package w;

public class Rectangle {
    // 定义长和宽的属性
    private double length;
    private double width;

    // 构造方法，初始化长和宽
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // 方法返回矩形的面积
    public double getArea() {
        return this.length * this.width;
    }

    // 主方法用于测试
    public static void main(String[] args) {
        // 创建一个Rectangle对象
        Rectangle rect = new Rectangle(5.0, 3.0);

        // 输出矩形的面积
        System.out.println("矩形的面积是: " + rect.getArea());
    }
}

