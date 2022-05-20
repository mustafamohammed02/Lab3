public class ATM {

    double balance = 0;
    deposit d = new deposit();


    public double operate(int x, double amount) {
        this.balance = d.deposit(amount,balance);

        return balance;}}

