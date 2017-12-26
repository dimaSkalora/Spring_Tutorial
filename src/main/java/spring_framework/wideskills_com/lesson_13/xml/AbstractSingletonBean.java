package spring_framework.wideskills_com.lesson_13.xml;

public abstract class AbstractSingletonBean {
    public AbstractSingletonBean()
    {
        System.out.println("Singleton Bean Instantiated !!");
    }
    public abstract PrototypeBean getPrototypeBean();
}
