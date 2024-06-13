package June.Rectangle;

public class Rectangle {
    private double length;
    private double width;

    // 构造函数
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // 获取面积的方法
    public double getArea() {
        return length * width;
    }

    // 获取周长的方法
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // 打印长方形信息的方法
    public void printInfo() {
        System.out.println("长方形:");
        System.out.println("长度: " + length);
        System.out.println("宽度: " + width);
        System.out.println("面积: " + getArea());
        System.out.println("周长: " + getPerimeter());
    }

    // 获取和设置长度的方法
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // 获取和设置宽度的方法
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

