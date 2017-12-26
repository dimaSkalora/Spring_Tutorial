package spring_framework.wideskills_com.lesson_13.java_config;

public class SingletonBean {
    private PrototypeBean prototypeBean;
    public SingletonBean()
    {
        System.out.println("Singleton Bean Instantiated !!");
    }
    public PrototypeBean getPrototypeBean() {
        return prototypeBean;
    }
    public void setPrototypeBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
    }
}
