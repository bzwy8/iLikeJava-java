package June.BasicAccount;

public class TestSavingsAccount {
    public static void main(String[] args) {
        // 设置年利率
        SavingsAccount.setAnnualInterestRate(0.04);  // 4% 年利率

        // 创建储蓄账户
        SavingsAccount account = new SavingsAccount(1000);

        // 显示初始余额
        System.out.println("初始余额: " + account.getBalance());

        // 计算并显示第一个月的利息
        double firstMonthInterest = account.calculateMonthlyInterest();
        System.out.println("第一个月利息: " + firstMonthInterest);

        // 将利息添加到余额中
        account.deposit(firstMonthInterest);

        // 显示新余额
        System.out.println("加上第一个月利息后的余额: " + account.getBalance());

        // 更改年利率
        SavingsAccount.setAnnualInterestRate(0.05);  // 5% 年利率

        // 计算并显示第二个月的利息
        double secondMonthInterest = account.calculateMonthlyInterest();
        System.out.println("第二个月利息: " + secondMonthInterest);

        // 将利息添加到余额中
        account.deposit(secondMonthInterest);

        // 显示新余额
        System.out.println("加第二个月利息后的余额: " + account.getBalance());
    }
}
