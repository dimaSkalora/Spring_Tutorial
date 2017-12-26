package spring_framework.wideskills_com.lesson_13.java_config;

public abstract class AbstractSingletonBean {
    public AbstractSingletonBean()
    {
        System.out.println("Singleton Bean Instantiated !!");
    }
    public abstract PrototypeBean getPrototypeBean();
}
