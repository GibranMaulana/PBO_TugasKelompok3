package entity;

public class User {
    private String name;
    private int idUser;
    private Account account;

    public User(String name, int idUser, Account account) {
        this.name = name;
        this.idUser = idUser;
        this.account = account;
    }
    
    public String getName() {
        return name;
    }

    public int getIdUser() {
        return idUser;
    }

    protected void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getAccountUsername() {
        return account.getUsername();
    }

    protected String setAccount(Account account) {
        this.account = account;
        return account.getUsername();
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        // System.out.println("Bank ID: " + bankId);
        System.out.println("Name\t\t: " + getName());
        System.out.println("Account\t\t: " + getAccountUsername());

    }  

}