package spring_framework.wideskills_com.lesson_20.xml.programmatic_transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProgrammaticTransaction {

    public static void main(String args[]){

        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_20/programmaticTransaction-beans.xml");
        BuyProduct buy  = (BuyProduct)context.getBean("buyProduct");
        buy.buyProduct("user1", 101);
        buy.displayState("user1", 101);
        buy.buyProduct("user2", 102);
        buy.displayState("user2", 102);
    }
}
