package spring_framework.proselyte_net.lesson_08.inheritance;

public class MessageToYou {
    private String message;
    private String messageToYou;

    public String getMessage() {
        return "This is simple message: " + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageToYou() {
        return "And this message is special for You: " + messageToYou;

    }

    public void setMessageToYou(String messageToYou) {
        this.messageToYou = messageToYou;
    }
}
