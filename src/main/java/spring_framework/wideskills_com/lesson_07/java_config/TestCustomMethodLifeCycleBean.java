package spring_framework.wideskills_com.lesson_07.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import spring_framework.wideskills_com.lesson_07.java_config.beans.InitializingDisposableBeans;

public class TestCustomMethodLifeCycleBean {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(InitializingDisposableBeans.class);
        CustomLifeCycleMehodBean bean =  context.getBean(CustomLifeCycleMehodBean.class);
        ((AbstractApplicationContext) context).registerShutdownHook();
    }
}