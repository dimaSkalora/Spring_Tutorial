package spring_framework.wideskills_com.lesson_13.xml;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AwareSingletonBean implements ApplicationContextAware {
    private PrototypeBean prototypeBean;
    private ApplicationContext applicationContext;

    public AwareSingletonBean() {
        System.out.println("Singleton Bean Instantiated !!");
    }

    public PrototypeBean getPrototypeBean() {
        prototypeBean = (PrototypeBean) applicationContext.getBean("prototypeBean");
        return prototypeBean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        this.applicationContext = applicationContext;
    }
}