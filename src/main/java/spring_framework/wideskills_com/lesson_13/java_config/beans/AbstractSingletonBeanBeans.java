package spring_framework.wideskills_com.lesson_13.java_config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import spring_framework.wideskills_com.lesson_13.java_config.AbstractSingletonBean;
import spring_framework.wideskills_com.lesson_13.java_config.PrototypeBean;

@Configuration
public class AbstractSingletonBeanBeans {
    @Bean
    @Scope(value = "prototype")
    public PrototypeBean prototypeBean(){
        PrototypeBean prototypeBean = new PrototypeBean();
        prototypeBean.setMessage("Test Message");

        return prototypeBean;
    }

    @Bean
    public AbstractSingletonBean abstractSingletonBean(){
        AbstractSingletonBean abstractSingletonBean = new AbstractSingletonBean() {
            @Override
            public PrototypeBean getPrototypeBean() {
                return prototypeBean();
            }
        };
        return abstractSingletonBean;
    }
}
