package spring_framework.proselyte_net.lesson_10.collection_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjectionRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/proselyte_net/Lesson_10/collection-injection-config.xml");

        CollectionInjection collectionInjection =
                (CollectionInjection) context.getBean("collectionInjection");

        collectionInjection.getDocumentList();
        collectionInjection.getDocumentSet();
        collectionInjection.getDocumentMap();
        collectionInjection.getDocumentProp();
    }
}
