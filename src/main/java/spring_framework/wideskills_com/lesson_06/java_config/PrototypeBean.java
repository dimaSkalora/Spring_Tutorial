package spring_framework.wideskills_com.lesson_06.java_config;

public class PrototypeBean {
    private String message;

    public PrototypeBean()
    {
        System.out.println("Prototype Bean Instantiated !!");
    }
    public void setMessage(String message){
        this.message  = message;
    }
    public String  getMessage(){
        return this.message;
    }
}
