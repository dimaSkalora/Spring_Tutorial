package spring_framework.wideskills_com.lesson_13.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.wideskills_com.lesson_13.java_config.beans.AbstractSingletonBeanBeans;

public class TestProgramAbstract {
    public static void main(String[] args) {
        ApplicationContext context =
               new AnnotationConfigApplicationContext(AbstractSingletonBeanBeans.class);
        AbstractSingletonBean abstractSingletonBean = (AbstractSingletonBean) context.getBean("abstractSingletonBean");
        PrototypeBean prototypeBeanA = abstractSingletonBean.getPrototypeBean();
        PrototypeBean prototypeBeanB = abstractSingletonBean.getPrototypeBean();
        System.out.println(prototypeBeanA);
        System.out.println(prototypeBeanB);
        System.out.println("Is prototypeBeanA and prototypeBeanA  same ? " + (prototypeBeanA==prototypeBeanB));
    }
}
