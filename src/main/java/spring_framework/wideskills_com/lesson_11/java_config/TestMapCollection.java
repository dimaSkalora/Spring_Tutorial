package spring_framework.wideskills_com.lesson_11.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.wideskills_com.lesson_11.java_config.beans.MapBeans;

public class TestMapCollection {
    public static void main(String[] args) {
        ApplicationContext context =
             new AnnotationConfigApplicationContext(MapBeans.class);
        Bank bank = (Bank)context.getBean("bank");
        System.out.println("Bank Name :" + bank.getName());
        System.out.println("Bank Timings :" + bank.getTimings());
        System.out.println("Bank Accounts :" + bank.getAccounts());
    }
}
