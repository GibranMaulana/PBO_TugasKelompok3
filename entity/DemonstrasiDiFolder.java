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
        System.out.println("   Bank ID (protected): " + user.getBankId());
        
        // Using protected setters
        System.out.println("   Updating user data using protected setters...");
        user.setBalance(1500.0);
        user.setBankId("BANK002");
        user.setName("Alice Updated");
        
        System.out.println("   Updated user info:");
        user.displayInfo();
    }
    
    public void demonstratePrivateAccessLimitations() {
        System.out.println("   === PRIVATE ACCESS LIMITATIONS ===");
        System.out.println("   Private fields and methods CANNOT be accessed directly:");
        System.out.println("   - account.noRek (private field) - COMPILATION ERROR");
        System.out.println("   - account.pin (private field) - COMPILATION ERROR");
        System.out.println("   - account.password (private field) - COMPILATION ERROR");
        System.out.println("   - bank.generateUUID() (private method) - COMPILATION ERROR");
        System.out.println("   - bank.uuidExist() (private method) - COMPILATION ERROR");
        System.out.println("   We can only access private data through public/protected getters!");
    }
}