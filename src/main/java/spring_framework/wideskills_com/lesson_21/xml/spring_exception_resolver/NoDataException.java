package spring_framework.wideskills_com.lesson_21.xml.spring_exception_resolver;

public class NoDataException extends RuntimeException {

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
