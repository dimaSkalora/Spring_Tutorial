package spring_framework.tutorialspoint_com.lesson_24.xml.commons_logging;

public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage() {
        System.out.println("Your Message : " + message);
    }
}
