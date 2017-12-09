package spring_framework.tutorialspoint_com.lesson_05.xml;

public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("Your Message: "+message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
