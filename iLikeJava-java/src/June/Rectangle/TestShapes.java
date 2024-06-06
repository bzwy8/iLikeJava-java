package June.Rectangle;

public class TestShapes {
    public static void main(String[] args) {
        // 创建一个长方形对象
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        rectangle.printInfo();
        System.out.println();

        // 创建一个正方形对象
        Square square = new Square(3.0);
        square.printInfo();
        System.out.println();

        // 修改正方形的边长并测试
        square.setLength(4.0);
        System.out.println("After modifying the side of the square:");
        square.printInfo();
        System.out.println();

        // 修改正方形的宽度并测试（实际上是边长）
        square.setWidth(5.0);
        System.out.println("After modifying the width of the square (which is the side):");
        square.printInfo();
    }
}
