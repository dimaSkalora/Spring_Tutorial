package spring_framework.tutorialspoint_com.lesson_18.xml;

public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
