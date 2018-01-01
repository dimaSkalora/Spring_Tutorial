package spring_framework.wideskills_com.lesson_19.xml.jdbc_call;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestProductJdbcCall {
    public static void main(String args[]){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_19/jdbcCall-beans.xml");
        ProductJdbcCall productJdbcCall = (ProductJdbcCall)context.getBean("productJdbcCall");
        productJdbcCall.callProcedure(104,"ProductAccount A","Brand A",230);
        productJdbcCall.callProcedure(105,"ProductAccount B","Brand B",130);
        List<Product> products = productJdbcCall.getAllProducts();
        System.out.println(products);
    }
}
