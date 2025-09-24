package entity;

public class Account {
    private int noRek;
    private int pin;
    private String username;
    private String password;
    private String email;
    private double balance;

    public Account(int noRek, int pin, String username, String password, String email) {
        this.noRek = noRek;
        setPin(pin);
        this.username = username;
        setPassword(password);
        this.email = email;
        this.balance = 0.0; 
    }
    
    public int getNoRek() {
        return noRek;
    }
    public void setNoRek(int noRek) {
        this.noRek = noRek;
    }   
    public int getPin() {
        return pin;
    }
    protected void setPin(int pin) {
        if (pin < 1000 || pin > 9999) {
            System.out.println("PIN must be a 4-digit number.");
        } else {
            this.pin = pin;
        }
    }
  
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }   
    public void setPassword(String password) {
        if (password.length() < 6) {
            System.out.println("Password must be at least 6 characters long.");
        } else {
            this.password = password;
        }
    }
    protected String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    protected void displayInfo() {
        System.out.println("Account Information:");
        System.out.println("Account Number: " + noRek);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Balance : " + balance);
    }  

}

