package spring_framework.wideskills_com.lesson_13.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.wideskills_com.lesson_13.java_config.beans.AwareSingletonBeanBeans;

public class TestProgramAware {
    public static void main(String[] args) {
        ApplicationContext context =
          new AnnotationConfigApplicationContext(AwareSingletonBeanBeans.class);
        AwareSingletonBean singletonBean = (AwareSingletonBean) context.getBean("awareSingletonBean");
        PrototypeBean prototypeBeanA = singletonBean.getPrototypeBean();
        PrototypeBean prototypeBeanB = singletonBean.getPrototypeBean();
        System.out.println(prototypeBeanA);
        System.out.println(prototypeBeanB);
        System.out.println("Is prototypeBeanA and prototypeBeanA  same ? " + (prototypeBeanA==prototypeBeanB));
    }
}
