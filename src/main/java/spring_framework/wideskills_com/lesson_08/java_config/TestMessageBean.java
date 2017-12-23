package spring_framework.wideskills_com.lesson_08.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestMessageBean {
    public static void main(String[] args) {
        ApplicationContext context =
              new AnnotationConfigApplicationContext(MessageBeanBeans.class);
        MessageBean bean = context.getBean(MessageBean.class);
        ((AbstractApplicationContext) context).registerShutdownHook();
    }
}
