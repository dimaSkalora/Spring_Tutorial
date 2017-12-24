package spring_framework.wideskills_com.lesson_11.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestMapCollection {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_11/map-beans.xml");
        Bank bank = (Bank)context.getBean("bank");
        System.out.println("Bank Name :" + bank.getName());
        System.out.println("Bank Timings :" + bank.getTimings());
        System.out.println("Bank Accounts :" + bank.getAccounts());
    }
}
