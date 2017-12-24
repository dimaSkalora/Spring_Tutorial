package spring_framework.wideskills_com.lesson_11.java_config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_framework.wideskills_com.lesson_11.java_config.DataSource;

import java.util.Properties;

@Configuration
public class PropertiesBeans {
    @Bean
    public DataSource dataSource(){
        DataSource dataSource = new DataSource();
        Properties properties = new Properties();
        properties.setProperty("username","root");
        properties.setProperty("password","");
        properties.setProperty("host","localhost");
        properties.setProperty("port","3306");
        dataSource.setDbProperties(properties);

        return dataSource;
    }
}
