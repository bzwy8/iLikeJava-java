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
        System.out.println(name + " is running.");
    }

    // 走的方法
    public void walk() {
        System.out.println(name + " is walking.");
    }

    // 获取动物信息的方法
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Weight: " + weight + " kg");
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

