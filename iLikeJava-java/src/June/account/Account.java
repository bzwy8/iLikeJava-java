package June.account;


public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // 构造函数
    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // 存款方法
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("已成功存入: " + amount);
        } else {
            System.out.println("存款金额必须为正数.");
        }
    }

    // 取款方法
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("提现成功: " + amount);
        } else if (amount > balance) {
            System.out.println("余额不足.");
        } else {
            System.out.println("提款金额必须为正数.");
        }
    }

    // 获取余额方法
    public double getBalance() {
        return balance;
    }

    // 打印账户信息方法
    public void printAccountInfo() {
        System.out.println("帐号: " + accountNumber);
        System.out.println("账户持有人: " + accountHolderName);
        System.out.println("余额: " + balance);
    }
}

