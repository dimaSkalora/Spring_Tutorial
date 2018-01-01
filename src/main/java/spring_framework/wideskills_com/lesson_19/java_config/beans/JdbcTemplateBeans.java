package spring_framework.wideskills_com.lesson_19.java_config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import spring_framework.wideskills_com.lesson_19.java_config.jdbc_template.EmployeeJdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class JdbcTemplateBeans {
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
    public EmployeeJdbcTemplate employeeJdbcTemplate(){
        EmployeeJdbcTemplate employeeJdbcTemplate = new EmployeeJdbcTemplate();
        employeeJdbcTemplate.setDataSource(getDataSource());

        return employeeJdbcTemplate;
    }
}
