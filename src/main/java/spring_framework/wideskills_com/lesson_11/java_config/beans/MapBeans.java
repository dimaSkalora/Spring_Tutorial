package spring_framework.wideskills_com.lesson_11.java_config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_framework.wideskills_com.lesson_11.java_config.Account;
import spring_framework.wideskills_com.lesson_11.java_config.Bank;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class MapBeans {
    @Bean
    public Account account1(){
        Account account = new Account();
        account.setHolderName("Joe");
        account.setBalance("$1200");

        return account;
    }
    @Bean
    public Account account2(){
        Account account = new Account();
        account.setHolderName("Bloggs");
        account.setBalance("$2200");

        return account;
    }
    @Bean
    public Account account3(){
        Account account = new Account();
        account.setHolderName("Gary");
        account.setBalance("$1800");

        return account;
    }

    @Bean
    public Bank bank(){
        Bank bank = new Bank();
        bank.setName("My Bank Name");
        Map<String,String> timingsMap = new HashMap<>();
        timingsMap.put("Monday","8:00 AM to 5:00 PM");
        timingsMap.put("Tuesday","8:00 AM to 5:00 PM");
        timingsMap.put("Wednesday","9:00 AM to 6:00 PM");
        timingsMap.put("Thursday","9:00 AM to 5:00 PM");
        timingsMap.put("Friday","9:00 AM to 5:00 PM");
        timingsMap.put("Saturday","9:00 AM to 1:00 PM");
        timingsMap.put("Sunday","Holiday");
        bank.setTimings(timingsMap);

        Map<String,Account> accountsMap = new HashMap<>();
        accountsMap.put("account1",account1());
        accountsMap.put("account2",account2());
        accountsMap.put("account3",account3());
        bank.setAccounts(accountsMap);

        return bank;
    }

}
