package w;

public class Car {
    private String brand;
    private String model;
    private int seats;
    private String color;
    private int price;
    private int lastMonthSales;

    public Car(String brand, String model, int seats, String color, int price, int lastMonthSales) {
        this.brand = brand;
        this.model = model;
        this.seats = seats;
        this.color = color;
        this.price = price;
        this.lastMonthSales = lastMonthSales;
    }

    public int calculateMonthlySalesAmount() {
        return price * lastMonthSales;
    }

    public void displaySalesDetails() {
        System.out.println("品牌: " + brand);
        System.out.println("型号: " + model);
        System.out.println("座位数: " + seats + "个");
        System.out.println("颜色: " + color);
        System.out.println("价格: " + price + "元");
        System.out.println("上个月销量: " + lastMonthSales + "辆");
        System.out.println("上个月销售额: " + calculateMonthlySalesAmount());
        System.out.println();
    }

    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("奔驰", "GLS", 7, "白色", 1080000, 10);
        cars[1] = new Car("宝马", "X5", 5, "棕色", 980000, 15);
        cars[2] = new Car("奥迪", "Q7", 7, "黑色", 750000, 20);

        int totalSalesAmount = 0;
        for (Car car : cars) {
            car.displaySalesDetails();
            totalSalesAmount += car.calculateMonthlySalesAmount();
        }

        System.out.println("上个月总销售额: " + totalSalesAmount);
    }
}
