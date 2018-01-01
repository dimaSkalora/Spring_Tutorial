package spring_framework.wideskills_com.lesson_19.java_config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import spring_framework.wideskills_com.lesson_19.java_config.jdbc_call.ProductJdbcCall;

import javax.sql.DataSource;

@Configuration
public class JdbcCallBeans {
    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/spring_tutorial");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root");

        return driverManagerDataSource;
    }

    @Bean
    public ProductJdbcCall productJdbcCall(){
        ProductJdbcCall productJdbcCall = new ProductJdbcCall();
        productJdbcCall.setDataSource(getDataSource());

        return productJdbcCall;
    }
}
