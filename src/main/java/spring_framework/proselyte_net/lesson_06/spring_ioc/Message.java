package spring_framework.proselyte_net.lesson_06.spring_ioc;

public class Message {
    private String message;

    public String getMessage() {
        return "Message: " + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void beanInit(){
        System.out.println("Bean is passing init stage.");
    }

    public void beanDestroy(){
        System.out.println("Bean is passing destroy stage.");
    }
}
