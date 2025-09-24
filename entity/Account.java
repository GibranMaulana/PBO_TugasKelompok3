package entity;

public class Account {
    private String username;
    private String password;
    private String email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }   
    protected String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if (password.length() < 6) {
            System.out.println("Password must be at least 6 characters long.");
        } else {
            this.password = password;
        }
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    protected void displayInfo() {
        System.out.println("Account Information:");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }
    

}

