package spring_framework.wideskills_com.lesson_19.java_config.jdbc_call;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.wideskills_com.lesson_19.java_config.beans.JdbcCallBeans;

import java.util.List;

public class TestProductJdbcCall {
    public static void main(String args[]){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(JdbcCallBeans.class);
        ProductJdbcCall productJdbcCall = (ProductJdbcCall)context.getBean("productJdbcCall");
        productJdbcCall.callProcedure(104,"ProductAccount A","Brand A",230);
        productJdbcCall.callProcedure(105,"ProductAccount B","Brand B",130);
        List<Product> products = productJdbcCall.getAllProducts();
        System.out.println(products);
    }
}
