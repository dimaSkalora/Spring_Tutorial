package spring_framework.tutorialspoint_com.lesson_06.xml.bean_factory;

public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("Your Message: "+message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
