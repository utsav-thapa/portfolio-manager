public class CreditCard implements Valuable{
    private double balance = 0;

    public double getValue() {
        return this.balance;
    }

    public void pay(double amount){
        this.balance -= amount;
    }

    public void charge(double amount){
        this.balance += amount;
    }

}
