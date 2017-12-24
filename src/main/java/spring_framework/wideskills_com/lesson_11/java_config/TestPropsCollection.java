package spring_framework.wideskills_com.lesson_11.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.wideskills_com.lesson_11.java_config.beans.PropertiesBeans;

public class TestPropsCollection {
    public static void main(String[] args) {
        ApplicationContext context =
          new AnnotationConfigApplicationContext(PropertiesBeans.class);
        DataSource dataSource =(DataSource)context.getBean("dataSource");
        System.out.println(dataSource.getDbProperties());
    }
}
