package spring_framework.wideskills_com.lesson_11.java_config;

public class State {
    private String name;
    private String countryCode;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    @Override
    public String toString() {
        return "State [name=" + name + ", countryCode=" + countryCode + "]";
    }
}
