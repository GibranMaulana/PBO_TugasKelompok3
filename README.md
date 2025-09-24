# Bank System - Access Modifiers Demonstration

This project demonstrates the four access modifiers in Java through a simple banking system.

## Access Modifiers Overview

### 1. **PUBLIC** (`public`)
- **Accessibility**: Can be accessed from anywhere
- **Used in**: Classes, methods, constructors, fields
- **Example in our system**:
  ```java
  public class Bank { ... }
  public void addAccount(Account account) { ... }
  public String getUsername() { ... }
  ```

### 2. **PROTECTED** (`protected`)
- **Accessibility**: Within same package AND subclasses (even in different packages)
- **Used in**: Methods, constructors, fields (not classes at top level)
- **Example in our system**:
  ```java
  protected void setPin(int pin) { ... }
  protected String getPassword() { ... }
  protected int getTotalAccount() { ... }
  ```

### 3. **PACKAGE-PRIVATE** (default - no modifier)
- **Accessibility**: Only within the same package
- **Used in**: Classes, methods, constructors, fields
- **Example in our system**:
  ```java
  void clearAllAccounts() { ... }
  void resetBank() { ... }
  ```

### 4. **PRIVATE** (`private`)
- **Accessibility**: Only within the same class
- **Used in**: Methods, constructors, fields (not classes at top level)
- **Example in our system**:
  ```java
  private Map<UUID, Account> accountList;
  private UUID generateUUID() { ... }
  private boolean uuidExist(UUID uuid) { ... }
  ```

## Class Structure and Access Modifiers Used

### Bank Class (`entity/Bank.java`)
- **Public methods**: `addAccount()`, `removeAccount()`, `findAccount()`
- **Protected methods**: `getTotalAccount()`, `printJumlahAccount()`, `displayBankInfo()`
- **Package-private methods**: `clearAllAccounts()`, `resetBank()`
- **Private methods**: `generateUUID()`, `uuidExist()`, `getAccountList()`
- **Private fields**: `accountList`

### Account Class (`entity/Account.java`)
- **Public methods**: `getNoRek()`, `getPin()`, `getUsername()`, `setUsername()`, `getEmail()`, `setEmail()`, `getBalance()`, `setBalance()`
- **Protected methods**: `setPin()`, `getPassword()`, `displayInfo()`
- **Private fields**: `noRek`, `pin`, `username`, `password`, `email`, `balance`

### User Class (`entity/User.java`)
- **Public methods**: `getName()`, `getIdUser()`, `getAccountUsername()`, `displayInfo()`
- **Protected methods**: `setIdUser()`, `setAccount()`, `setName()`
- **Private fields**: `name`, `idUser`, `account`

### BankDemo Class (`entity/BankDemo.java`)
- **Public methods**: All demonstration methods
- **Purpose**: Demonstrates access to protected and package-private members from within the same package

## Key Demonstrations

### 1. Public Access
- All classes can access public members
- Demonstrated through account creation and basic operations

### 2. Protected Access
- `BankDemo` class (same package) can access protected methods
- Shows password access, PIN setting, account info display

### 3. Package-Private Access
- Only classes in the same package can access default members
- Demonstrated through `clearAllAccounts()` method

### 4. Private Access Limitations
- Private members cannot be accessed from outside the class
- Only accessible through public/protected getter methods

## Running the Demonstration

```bash
# Compile all Java files
javac -d . *.java entity/*.java

# Run the demonstration
java Kelompok3
```

## Output Explanation

The program output shows:
1. **Public access**: Basic account operations and data retrieval
2. **Protected access**: Advanced operations like password access and account info display
3. **Package-private access**: Administrative operations like clearing accounts
4. **Private access**: Limitations and how to access private data through public methods

## Best Practices Demonstrated

1. **Encapsulation**: Private fields with public/protected getters and setters
2. **Security**: Sensitive operations (like password access) are protected
3. **Package cohesion**: Related classes in the same package can share functionality
4. **Information hiding**: Implementation details (UUID generation) are private

This demonstration shows how access modifiers provide different levels of encapsulation and control over class member accessibility in Java.