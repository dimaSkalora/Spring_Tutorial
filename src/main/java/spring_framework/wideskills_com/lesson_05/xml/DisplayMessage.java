package spring_framework.wideskills_com.lesson_05.xml;

public class DisplayMessage {
    private String message;

    public DisplayMessage()
    {
        System.out.println("Display Message Bean Crated !!!");
    }
    public void setMessage(String message){
        this.message  = message;
    }
    public String  getMessage(){
        return this.message;
    }
}
