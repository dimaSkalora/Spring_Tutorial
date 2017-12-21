package spring_framework.tutorialspoint_com.lesson_24.xml.log4j;

public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage() {
        System.out.println("Your Message : " + message);
    }
}
