package June.Animal;

public class Animal {
    private String name;
    private String size;
    private double weight;

    // 构造函数
    public Animal(String name, String size, double weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    // 跑的方法
    public void run() {
        System.out.println(name + " 在跑.");
    }

    // 走的方法
    public void walk() {
        System.out.println(name + " 正在行走.");
    }

    // 获取动物信息的方法
    public void printInfo() {
        System.out.println("名称: " + name);
        System.out.println("大小: " + size);
        System.out.println("重量: " + weight + " kg");
    }

    // 获取和设置名称的方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 获取和设置大小的方法
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // 获取和设置重量的方法
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

