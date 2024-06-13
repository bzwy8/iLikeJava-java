package q;

class Car {
    // Attributes
    String brand;
    String model;
    int seats;
    String color;
    int price;
    int lastMonthSales;

    // Constructor
    public Car(String brand, String model, int seats, String color, int price, int lastMonthSales) {
        this.brand = brand;
        this.model = model;
        this.seats = seats;
        this.color = color;
        this.price = price;
        this.lastMonthSales = lastMonthSales;
    }

    // Method to calculate sales amount for this car
    public int calculateSalesAmount() {
        return this.price * this.lastMonthSales;
    }
}

public class CarSalesStatistics {
    public static void main(String[] args) {
        // Create car objects with the provided data
        Car car1 = new Car("奔驰", "GLS", 7, "白色", 1080000, 10);
        Car car2 = new Car("宝马", "X5", 5, "棕色", 980000, 15);
        Car car3 = new Car("奥迪", "Q7", 7, "黑色", 750000, 20);

        // Calculate the total sales amount for last month
        int totalSalesAmount = car1.calculateSalesAmount() + car2.calculateSalesAmount() + car3.calculateSalesAmount();

        // Print the sales details
        System.out.println("上月销售明细：");
        System.out.println(car1.brand + " " + car1.model + " 销售金额: " + car1.calculateSalesAmount() + " 元");
        System.out.println(car2.brand + " " + car2.model + " 销售金额: " + car2.calculateSalesAmount() + " 元");
        System.out.println(car3.brand + " " + car3.model + " 销售金额: " + car3.calculateSalesAmount() + " 元");

        // Print the total sales amount
        System.out.println("上月总销售金额: " + totalSalesAmount + " 元");
    }
}

