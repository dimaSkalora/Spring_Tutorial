package spring_framework.wideskills_com.lesson_07.java_config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_framework.wideskills_com.lesson_07.java_config.PersonBean;

@Configuration
public class InitializingDisposableBeans {

    @Bean()
    public PersonBean personBean(){
        PersonBean personBean = new PersonBean();
        personBean.setName("Dummy Person");
        return personBean;
    }
}
