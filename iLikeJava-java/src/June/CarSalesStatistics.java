package June;

class Car {
    private String brand;
    private String model;
    private int seatCount;
    private String color;
    private int unitPrice;
    private int lastMonthSales;

    public Car(String brand, String model, int seatCount, String color, int unitPrice, int lastMonthSales) {
        this.brand = brand;
        this.model = model;
        this.seatCount = seatCount;
        this.color = color;
        this.unitPrice = unitPrice;
        this.lastMonthSales = lastMonthSales;
    }

    public int calculateMonthlySales() {
        return unitPrice * lastMonthSales;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public String getColor() {
        return color;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getLastMonthSales() {
        return lastMonthSales;
    }
}

public class CarSalesStatistics {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("奔驰", "GLS", 7, "白色", 1080000, 10),
                new Car("宝马", "X5", 5, "棕色", 980000, 15),
                new Car("奥迪", "Q7", 7, "黑色", 750000, 20)
        };

        int totalSalesAmount = 0;
        for (Car car : cars) {
            totalSalesAmount += car.calculateMonthlySales();
        }

        System.out.println("上个月总销售金额: " + totalSalesAmount + "元");
    }
}
