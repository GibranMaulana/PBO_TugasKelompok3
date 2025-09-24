package entity;

public class User {
    private String bankId;
    private String name;
    private String noRek;
    private double balance;
    // private 

    public User(String bankId, String name, String noRek, double balance) {
        this.bankId = bankId;
        this.name = name;
        this.noRek = noRek;
        this.balance = balance;
    }

    protected String getBankId() {
        return bankId;
    }

    public String getName() {
        return name;
    }
    public String getNoRek() {
        return noRek;
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

    protected void setBankId(String bankId) {
        this.bankId = bankId;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setNoRek(String noRek) {
        this.noRek = noRek;
    }

    public void displayInfo() {
        // System.out.println("Bank ID: " + bankId);
        System.out.println("Rekening\t: " + getNoRek());
        System.out.println("Name\t\t: " + getName());
        System.out.println("Balance\t\t: " + getBalance());
    }  

}