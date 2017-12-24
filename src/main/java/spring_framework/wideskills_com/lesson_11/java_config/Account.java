package spring_framework.wideskills_com.lesson_11.java_config;

public class Account {
    private String holderName ;
    private String balance ;
    public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public String getBalance() {
        return balance;
    }
    public void setBalance(String balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Account [holderName=" + holderName + ", balance=" + balance + "]";
    }
}
