package entity;

public class User {
    private String name;
    private double balance;
    private Account account;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }


    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        if (balance < 0) {
            balance = 0;
            System.out.println("Balance cannot be negative. Setting balance to 0.");
        }
        else {
            this.balance = balance;
        }
    }
    protected void setName(String name) {
        this.name = name;
    }
    public void displayInfo() {
        // System.out.println("Bank ID: " + bankId);
        System.out.println("Name\t\t: " + getName());
        System.out.println("Balance\t\t: " + getBalance());
    }  

}