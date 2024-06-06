package June.Animal;

public class TestAnimalBird {
    public static void main(String[] args) {
        // 创建一个动物对象
        Animal animal = new Animal("Elephant", "Large", 5000.0);
        animal.printInfo();
        animal.walk();
        animal.run();
        System.out.println();

        // 创建一个鸟类对象
        Bird bird = new Bird("Parrot", "Small", 1.0, "Green", 0.5);
        bird.printInfo();
        bird.walk();
        bird.run();
        bird.fly();
        System.out.println();

        // 修改鸟的属性并测试
        bird.setFeatherColor("Blue");
        bird.setWingSpan(0.6);
        System.out.println("After modifying the bird's attributes:");
        bird.printInfo();
    }
}
