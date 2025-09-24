package entity;

public class DemonstrasiDiFolder {
    
    public void demonstrateProtectedAccess(Bank bank, Account account) {
        System.out.println("   === PROTECTED ACCESS METHODS ===");
        
        // Accessing protected methods from Bank class
        System.out.println("   Total accounts (protected method): " + bank.getTotalAccount());
        bank.printJumlahAccount(); // protected method
        
        // Accessing protected methods from Account class
        System.out.println("   Displaying account info using protected method:");
        account.displayInfo(); // protected method
        System.out.println("   Account Password (protected getter): " + account.getPassword());
        
        // Trying to set PIN using protected method
        System.out.println("   Updating PIN using protected setter...");
        account.setPin(9999); // protected method
        System.out.println("   Updated PIN: " + account.getPin());
    }
    
    public void demonstrateDefaultAccess(Bank bank) {
        System.out.println("   === PACKAGE-PRIVATE (DEFAULT) ACCESS METHODS ===");
        
        // Show current count before clearing
        System.out.println("   Current accounts: " + bank.getTotalAccount());
        
        // Accessing package-private (default) method
        System.out.println("   Clearing all accounts using default access method...");
        bank.clearAllAccounts(); // package-private method
        System.out.println("   Total accounts after clearing: " + bank.getTotalAccount());
    }
    
    public void demonstrateUserProtectedAccess(User user) {
        System.out.println("   === USER PROTECTED ACCESS METHODS ===");
        System.out.println("   Current User ID (accessed via public getter): " + user.getIdUser());
        
        // Using protected setters - these can only be accessed from same package
        System.out.println("   Updating user data using PROTECTED setters...");
        System.out.println("   - setIdUser(9999) [PROTECTED METHOD]");
        user.setIdUser(9999);
        System.out.println("   - setName('Alice Updated') [PROTECTED METHOD]");
        user.setName("Alice Updated");
        
        // Creating a new account to demonstrate setAccount
        Account newAccount = new Account(99999, 1111, "NewAccount", "newpass", "new@email.com");
        System.out.println("   - setAccount(newAccount) [PROTECTED METHOD]");
        String accountUsername = user.setAccount(newAccount);
        System.out.println("   Protected setAccount method returned username: " + accountUsername);
        
        System.out.println("   Updated user info (via public displayInfo method):");
        user.displayInfo();
        
        System.out.println("   Note: These protected methods (setIdUser, setName, setAccount)");
        System.out.println("         can only be accessed from classes in the same package!");
    }
    
    public void demonstratePrivateAccessLimitations() {
        System.out.println("   === PRIVATE ACCESS LIMITATIONS ===");
        System.out.println("   Private fields and methods CANNOT be accessed directly:");
        System.out.println("   FROM ACCOUNT CLASS:");
        System.out.println("   - account.noRek (private field) - COMPILATION ERROR");
        System.out.println("   - account.pin (private field) - COMPILATION ERROR");
        System.out.println("   - account.password (private field) - COMPILATION ERROR");
        System.out.println("   - account.balance (private field) - COMPILATION ERROR");
        System.out.println("");
        System.out.println("   FROM BANK CLASS:");
        System.out.println("   - bank.accountList (private field) - COMPILATION ERROR");
        System.out.println("   - bank.generateUUID() (private method) - COMPILATION ERROR");
        System.out.println("   - bank.uuidExist() (private method) - COMPILATION ERROR");
        System.out.println("   - bank.getAccountList() (private method) - COMPILATION ERROR");
        System.out.println("");
        System.out.println("   FROM USER CLASS:");
        System.out.println("   - user.name (private field) - COMPILATION ERROR");
        System.out.println("   - user.idUser (private field) - COMPILATION ERROR");
        System.out.println("   - user.account (private field) - COMPILATION ERROR");
        System.out.println("");
        System.out.println("   ✓ We can only access private data through public/protected getters!");
    }
}