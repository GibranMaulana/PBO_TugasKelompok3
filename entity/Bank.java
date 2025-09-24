package entity;
import java.util.UUID;
import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<UUID, Account> accountList;
    
    public Bank() {
        this.accountList = new HashMap<>();
    }
    
    public void addAccount(Account account) {
        UUID uuid = generateUUID();

        if (uuidExist(uuid)) {
            addAccount(account);
        } else {
            accountList.put(uuid, account);
            System.out.println("\nSYSTEM: akun kamu telah berhasil kita simpan");
            System.out.println("nama: " + account.getUsername());
            System.out.println("UUID Kamu: " + uuid);
        }
    }

    public void removeAccount(UUID uuid) {
        if(uuidExist(uuid)) {
            accountList.remove(uuid);
            return;
        } 

        System.out.println("\nSYSTEM: UUID tidak dapat ditemukan. proses 'remove' dibatalkan");
        
    }

    public Account findAccount(UUID uuid) {
        if(uuidExist(uuid)) {
            return getAccountList().get(uuid);
        } else {
            return null;
        }
    }

    private UUID generateUUID() {
        return UUID.randomUUID();
    }
    
    private boolean uuidExist(UUID uuid) {
        return accountList.get(uuid) != null ? true : false;
    }

    private Map<UUID, Account> getAccountList() {
        return this.accountList;
    }
    
    protected int getTotalAccount() {
        return getAccountList().size(); 
    }

    protected void printJumlahAccount() {
        System.out.println("Total Jumlah akun: " + getTotalAccount());
    }

    void clearAllAccounts() {
        accountList.clear();
    }

    
}