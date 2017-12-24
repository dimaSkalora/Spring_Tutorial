package spring_framework.wideskills_com.lesson_11.xml;

import java.util.Map;
public class Bank {
    private String name;
    private Map<String,Account> accounts;
    private Map<String,String> timings ;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Map<String, Account> getAccounts() {
        return accounts;
    }
    public void setAccounts(Map<String, Account> accounts) {
        this.accounts = accounts;
    }
    public Map<String, String> getTimings() {
        return timings;
    }
    public void setTimings(Map<String, String> timings) {
        this.timings = timings;
    }
}
