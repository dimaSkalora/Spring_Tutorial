package spring_framework.wideskills_com.lesson_08.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageBeanBeans {
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public MessageBean messageBean(){
        MessageBean messageBean = new MessageBean();
        messageBean.setMessage("Test Message");
        return messageBean;
    }

    @Bean
    public MessageBeanPostProcessor messageBeanPostProcessor(){
        return new MessageBeanPostProcessor();
    }
}
