package spring_framework.wideskills_com.lesson_11.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.wideskills_com.lesson_11.java_config.beans.ListSetBeans;

public class TestCollection {
    public static void main(String[] args) {
        ApplicationContext context =
            new AnnotationConfigApplicationContext(ListSetBeans.class);
        Country country = context.getBean(Country.class);
        System.out.println(country.getStatesName());
        System.out.println(country.getStatesList());
        System.out.println(country.getStatesSet());
    }
}
