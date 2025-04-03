class Wallet {
    String owner;
    String bank;
    double balance;
    String type;
    boolean isActive;
    int transactions;
    String currency;
    long createdAt;
    String pin;
    boolean isVerified;

    public Wallet() {
    }

    public Wallet(String owner) {
        this.owner = owner;
    }

    public Wallet(String owner, String bank) {
        this.owner = owner;
        this.bank = bank;
    }

    public Wallet(String owner, String bank, double balance) {
        this.owner = owner;
        this.bank = bank;
        this.balance = balance;
    }

    public Wallet(String owner, String bank, double balance, String type) {
        this.owner = owner;
        this.bank = bank;
        this.balance = balance;
        this.type = type;
    }

    public Wallet(String owner, String bank, double balance, String type, boolean isActive) {
        this.owner = owner;
        this.bank = bank;
        this.balance = balance;
        this.type = type;
        this.isActive = isActive;
    }

    public Wallet(String owner, String bank, double balance, String type, boolean isActive, int transactions) {
        this.owner = owner;
        this.bank = bank;
        this.balance = balance;
        this.type = type;
        this.isActive = isActive;
        this.transactions = transactions;
    }

    public Wallet(String owner, String bank, double balance, String type, boolean isActive, int transactions, String currency) {
        this.owner = owner;
        this.bank = bank;
        this.balance = balance;
        this.type = type;
        this.isActive = isActive;
        this.transactions = transactions;
        this.currency = currency;
    }

    public Wallet(String owner, String bank, double balance, String type, boolean isActive, int transactions, String currency, long createdAt) {
        this.owner = owner;
        this.bank = bank;
        this.balance = balance;
        this.type = type;
        this.isActive = isActive;
        this.transactions = transactions;
        this.currency = currency;
        this.createdAt = createdAt;
    }

    public Wallet(String owner, String bank, double balance, String type, boolean isActive, int transactions, String currency, long createdAt, String pin) {
        this.owner = owner;
        this.bank = bank;
        this.balance = balance;
        this.type = type;
        this.isActive = isActive;
        this.transactions = transactions;
        this.currency = currency;
        this.createdAt = createdAt;
        this.pin = pin;
    }

    public Wallet(String owner, String bank, double balance, String type, boolean isActive, int transactions, String currency, long createdAt, String pin, boolean isVerified) {
        this.owner = owner;
        this.bank = bank;
        this.balance = balance;
        this.type = type;
        this.isActive = isActive;
        this.transactions = transactions;
        this.currency = currency;
        this.createdAt = createdAt;
        this.pin = pin;
        this.isVerified = isVerified;
    }

    public void display() {
        System.out.println("Owner: " + this.owner);
        System.out.println("Bank: " + this.bank);
        System.out.println("Balance: " + this.balance);
        System.out.println("Type: " + this.type);
        System.out.println("Active: " + this.isActive);
        System.out.println("Transactions: " + this.transactions);
        System.out.println("Currency: " + this.currency);
        System.out.println("Created At: " + this.createdAt);
        System.out.println("PIN: " + this.pin);
        System.out.println("Verified: " + this.isVerified);
        System.out.println();
    }
}