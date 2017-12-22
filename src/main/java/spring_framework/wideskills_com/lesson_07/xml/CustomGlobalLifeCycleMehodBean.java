package spring_framework.wideskills_com.lesson_07.xml;

public class CustomGlobalLifeCycleMehodBean {
    public CustomGlobalLifeCycleMehodBean()
    {
        System.out.println("Constructor of  bean is called !! ");
    }
    public void globalCustomDestroy() throws Exception {
        System.out.println("global custom destroy method of  bean is called !! ");
    }
    public void globalCustomInit() throws Exception {
        System.out.println("global custom Init  method of  bean is called !! ");
    }
}
