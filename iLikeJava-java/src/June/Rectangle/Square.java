package June.Rectangle;

public class Square extends Rectangle {

    // 构造函数
    public Square(double side) {
        super(side, side);
    }

    // 重写设置长度的方法，以确保长度和宽度相等
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    // 重写设置宽度的方法，以确保长度和宽度相等
    @Override
    public void setWidth(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    // 打印正方形信息的方法
    @Override
    public void printInfo() {
        System.out.println("正方形:");
        System.out.println("边: " + getLength());
        System.out.println("面积: " + getArea());
        System.out.println("周长: " + getPerimeter());
    }
}

