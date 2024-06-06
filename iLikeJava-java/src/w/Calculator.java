package w;

public class Calculator {
    // 属性 x 和 y
    private double x;
    private double y;

    // 构造方法初始化 x 和 y
    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 加法方法
    public double add() {
        return this.x + this.y;
    }

    // 减法方法
    public double subtract() {
        return this.x - this.y;
    }

    // 乘法方法
    public double multiply() {
        return this.x * this.y;
    }

    // 除法方法
    public double divide() {
        if (this.y != 0) {
            return this.x / this.y;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }

    // 主方法用于测试
    public static void main(String[] args) {
        // 创建一个 Calculator 对象
        Calculator calculator = new Calculator(10.0, 5.0);

        // 输出加法结果
        System.out.println("加法结果: " + calculator.add());

        // 输出减法结果
        System.out.println("减法结果: " + calculator.subtract());

        // 输出乘法结果
        System.out.println("乘法结果: " + calculator.multiply());

        // 输出除法结果
        System.out.println("除法结果: " + calculator.divide());
    }
}

