package spring_framework.wideskills_com.lesson_20.xml.programmatic_transaction;

public class Account {
    private String username;
    private int balance;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Account [username=" + username + ", balance=" + balance + "]";
    }
}
