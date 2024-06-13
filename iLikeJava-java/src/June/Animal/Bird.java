package June.Animal;

public class Bird extends Animal {
    private String featherColor;
    private double wingSpan;

    // 构造函数
    public Bird(String name, String size, double weight, String featherColor, double wingSpan) {
        super(name, size, weight);
        this.featherColor = featherColor;
        this.wingSpan = wingSpan;
    }

    // 飞翔的方法
    public void fly() {
        System.out.println(getName() + " 正在飞翔.");
    }

    // 获取鸟的信息
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("羽毛颜色: " + featherColor);
        System.out.println("翼展: " + wingSpan + " 米");
    }

    // 获取和设置羽毛颜色的方法
    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    // 获取和设置翼展的方法
    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
}

