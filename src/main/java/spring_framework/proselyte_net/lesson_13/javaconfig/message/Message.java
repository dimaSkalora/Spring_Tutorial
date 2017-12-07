package spring_framework.proselyte_net.lesson_13.javaconfig.message;

public class Message {
    private String message;

    /**
     * Getter and Setter methods
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * toString method
     */
    @Override
    public String toString() {
        return "Message: " + this.message;
    }
}
