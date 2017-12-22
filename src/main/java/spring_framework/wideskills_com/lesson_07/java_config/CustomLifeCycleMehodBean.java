package spring_framework.wideskills_com.lesson_07.java_config;

public class CustomLifeCycleMehodBean {
    private String name;

    public CustomLifeCycleMehodBean()
    {
        System.out.println("Constructor of  bean is called !! ");
    }

    public void customDestroy() throws Exception {

        System.out.println("custom destroy method of  bean is called !! ");
    }

    public void customInit() throws Exception {
        System.out.println("custom Init  method of  bean is called !! ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
