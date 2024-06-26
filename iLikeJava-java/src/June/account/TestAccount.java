package June.account;

public class TestAccount {
    public static void main(String[] args) {
        // 创建一个账户对象
        Account account = new Account("123456789", "John Doe", 1000.0);

        // 打印初始账户信息
        account.printAccountInfo();
        System.out.println();

        // 测试存款功能
        account.deposit(500.0);
        System.out.println("存款后:");
        account.printAccountInfo();
        System.out.println();

        // 测试取款功能
        account.withdraw(200.0);
        System.out.println("提款后:");
        account.printAccountInfo();
        System.out.println();

        // 测试取款超出余额的情况
        account.withdraw(1500.0);
        System.out.println("尝试提取超过余额后:");
        account.printAccountInfo();
        System.out.println();

        // 测试负数存款的情况
        account.deposit(-100.0);
        System.out.println("尝试存入负数后:");
        account.printAccountInfo();
        System.out.println();
    }
}

