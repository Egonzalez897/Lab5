/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * It may be helpful to use this.
     */
    public enum BankAccountType {
        /** Checking account type. */
        CHECKINGS,
        /** Savings account type. */
        SAVINGS,
        /** Checking account type. */
        STUDENT,
        /** Workplace account type. */
        WORKPLACE
    }

    /** the number of the account. */
    private int accountNumber;
    /** the type of account. */
    private BankAccountType accountType;
    /** the amount of money inside. */
    private double accountBalance;
    /** the name of the owner. */
    private String ownerName;
    /** the interest rate. */
    private double interestRate;
    /** the interest earned in the account. */
    private double interestEarned;

    /**
     * the constructor for the bank account.
     * @param name the name of the owner
     * @param accountCategory the type of account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        accountNumber = Bank.getNumberOfAccount();
        Bank.addAccount();
    }

    /**
     *
     * @return the interest earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * sets the interest earned.
     * @param newInterestEarned is what is earned.
     */
    public void setInterestEarned(final double newInterestEarned) {
        this.interestEarned = newInterestEarned;
    }

    /**
     *
     * @return interest rate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     *
     * @param newInterestRate the rate of interest to be set.
     */
    public void setInterestRate(final double newInterestRate) {
        this.interestRate = newInterestRate;
    }

    /**
     *
     * @return the name of the owner
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     *
     * @param newOwnerName the name to be set for the owner.
     */
    public void setOwnerName(final String newOwnerName) {
        this.ownerName = newOwnerName;
    }

    /**
     *
     * @return the account balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     *
     * @param newAccountBalance sets the account balance.
     */
    public void setAccountBalance(final double newAccountBalance) {
        this.accountBalance = newAccountBalance;
    }

    /**
     *
     * @return account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @param newAccountNumber sets this as the account number
     */
    public void setAccountNumber(final int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    /**
     *
     * @return account type
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     *
     * @param newAccountType the type to set the account to
     */
    public void setAccountType(final BankAccountType newAccountType) {
        this.accountType = newAccountType;
    }
}
