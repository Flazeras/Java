class BankAccount {
    private String fullName;
    private String bankAccountNo;
    private double balance;
    private int yearsActive;

    BankAccount(String fullName, String bankAccountNo, double balance, int yearsActive) {
        this.fullName = fullName;
        this.bankAccountNo = bankAccountNo;
        this.balance = balance;
        this.yearsActive = yearsActive;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public int getYearsActive() {
        return yearsActive;
    }

    public void setYearsActive(int yearsActive) {
        this.yearsActive = yearsActive;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String toString() {
        return ("fullName: "+fullName+"\nbankAccountNumber: "+bankAccountNo+"\nbalance: "+balance+"\nyearsActive: "+yearsActive);
    }
}
