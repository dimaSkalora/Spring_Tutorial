package spring_framework.wideskills_com.lesson_07.java_config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_framework.wideskills_com.lesson_07.xml.AwareBean;

@Configuration
public class ApplicationContextAwareBeanNameAwareBeanFactoryAwareBeans {
    @Bean
    public AwareBean awareBean(){
        return new AwareBean();
    }

}
