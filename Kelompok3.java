import entity.*;

public class Kelompok3 {
    public static void main(String[] args) {
        System.out.println("=== DEMONSTRATION OF BANK SYSTEM ACCESS MODIFIERS ===\n");
        
        // Create a bank instance
        Bank bank = new Bank();
        
        // ======================
        // 1. PUBLIC ACCESS DEMONSTRATION
        // ======================
        System.out.println("1. PUBLIC ACCESS MODIFIER DEMONSTRATION:");
        System.out.println("   - Public methods can be accessed from anywhere\n");
        
        // Creating accounts using public constructor and public methods
        Account account1 = new Account(12345, 1234, "John Doe", "password123", "john@email.com");
        Account account2 = new Account(67890, 5678, "Jane Smith", "mypass456", "jane@email.com");
        
        // Using public methods
        System.out.println("   Account 1 Username (public getter): " + account1.getUsername());
        System.out.println("   Account 1 Email (public getter): " + account1.getEmail());
        System.out.println("   Account 1 Balance (public getter): " + account1.getBalance());
        System.out.println("   Account 1 Number (public getter): " + account1.getNoRek());
        System.out.println("   Account 1 PIN (public getter): " + account1.getPin());
        
        // Adding accounts to bank using public method
        bank.addAccount(account1);
        bank.addAccount(account2);
        
        System.out.println("\n======================");
        
        // ======================
        // 2. PROTECTED & PACKAGE-PRIVATE ACCESS DEMONSTRATION
        // ======================
        System.out.println("2. PROTECTED & PACKAGE-PRIVATE ACCESS DEMONSTRATION:");
        System.out.println("   - These methods can only be accessed within the same package");
        System.out.println("   - Creating BankDemo instance from entity package to demonstrate\n");
        
        // Create a demonstration class from the same package
        DemonstrasiDiFolder demo = new DemonstrasiDiFolder();
        demo.demonstrateProtectedAccess(bank, account1);
        
        System.out.println();
        demo.demonstrateDefaultAccess(bank);
        
        System.out.println("\n======================");
        
        // ======================
        // 3. PRIVATE ACCESS DEMONSTRATION
        // ======================
        System.out.println("3. PRIVATE ACCESS MODIFIER DEMONSTRATION:");
        System.out.println("   - Private fields and methods cannot be accessed from outside the class");
        System.out.println("   - We can only access them through public/protected methods\n");
        
        demo.demonstratePrivateAccessLimitations();
        
        // Recreate accounts since they were cleared in demo
        Account newAccount = new Account(11111, 1111, "Test User", "testpass", "test@email.com");
        bank.addAccount(newAccount);
        
        System.out.println("\n   Examples of accessing private data through public methods:");
        System.out.println("   Account number (via public getter): " + newAccount.getNoRek());
        System.out.println("   PIN (via public getter): " + newAccount.getPin());
        System.out.println("   Balance (via public getter): " + newAccount.getBalance());
        
        System.out.println("\n======================");
        
        // ======================
        // 4. USER CLASS DEMONSTRATION
        // ======================
        System.out.println("4. USER CLASS ACCESS MODIFIER DEMONSTRATION:\n");
        
        // Create an account for the user
        Account userAccount = new Account(55555, 5555, "Alice Johnson", "alicepass", "alice@email.com");
        User user1 = new User("Alice Johnson", 1001, userAccount);
        
        // Public access
        System.out.println("   === PUBLIC ACCESS ===");
        System.out.println("   User Name (public): " + user1.getName());
        System.out.println("   User ID (public): " + user1.getIdUser());
        System.out.println("   Account Username (public): " + user1.getAccountUsername());
        
        // Public method
        System.out.println("   User Info (public method):");
        user1.displayInfo();
        
        System.out.println();
        // Protected methods demonstration
        demo.demonstrateUserProtectedAccess(user1);
        
        // Show limitations from outside package
        System.out.println("\n   === ACCESS LIMITATIONS FROM OUTSIDE PACKAGE ===");
        System.out.println("   From Kelompok3 class (different package), we CANNOT access:");
        System.out.println("   - user1.setIdUser(123) [PROTECTED] - COMPILATION ERROR");
        System.out.println("   - user1.setName('test') [PROTECTED] - COMPILATION ERROR");
        System.out.println("   - user1.setAccount(account) [PROTECTED] - COMPILATION ERROR");
        System.out.println("   We can only access PUBLIC methods like getName(), getIdUser(), etc.");
        
        System.out.println("\n======================");
        
        // ======================
        // 5. ACCESS MODIFIER SUMMARY
        // ======================
        System.out.println("5. ACCESS MODIFIER SUMMARY:");
        System.out.println("   PUBLIC: Accessible from anywhere");
        System.out.println("   PROTECTED: Accessible within package and subclasses");
        System.out.println("   PACKAGE-PRIVATE (no modifier): Accessible within same package only");
        System.out.println("   PRIVATE: Accessible within same class only");
        
        System.out.println("\n=== END OF DEMONSTRATION ===");
    }
} 
