package spring_framework.wideskills_com.lesson_20.xml.declarative_transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDeclarativeTransaction {
    public static void main(String args[]){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_20/declarativeTransaction-beans.xml");
        PurchaseProduct purchase  = (PurchaseProduct)context.getBean("purchaseProduct");
        purchase.buyProduct("user1", 101);
        purchase.displayState("user1", 101);
        purchase.buyProduct("user2", 102);
        purchase.displayState("user2", 102);
    }
}
