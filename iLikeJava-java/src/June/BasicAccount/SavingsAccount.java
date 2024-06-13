package June.BasicAccount;

public class SavingsAccount extends BasicAccount {
    private static double annualInterestRate;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public double calculateMonthlyInterest() {
        return balance * annualInterestRate / 12;
    }

    public static void setAnnualInterestRate(double newRate) {
        if (newRate >= 0) {
            annualInterestRate = newRate;
        } else {
            System.out.println("利率不能为负.");
        }
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }
}
