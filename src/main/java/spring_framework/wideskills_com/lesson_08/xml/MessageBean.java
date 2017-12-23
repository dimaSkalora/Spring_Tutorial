package spring_framework.wideskills_com.lesson_08.xml;

public class MessageBean {
    private String message;
    public MessageBean()
    {
        System.out.println("Constructor of  bean is called !! ");
    }
    public void init() throws Exception {
        System.out.println("custom custom init method of  bean is called !! ");
    }
    public void destroy() throws Exception {
        System.out.println(" custom destroy  method of  bean is called !! ");
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
