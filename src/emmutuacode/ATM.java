package emmutuacode;

public class ATM {
    private double balance = 1000;
    private double depositAmount;
    private double withdrawAmount;

    //default constructor

    public ATM(){

    }


    //getter setter == they are used to protect data


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
