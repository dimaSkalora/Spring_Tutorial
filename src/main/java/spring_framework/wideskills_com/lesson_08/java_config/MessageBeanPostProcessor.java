package spring_framework.wideskills_com.lesson_08.java_config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MessageBeanPostProcessor implements BeanPostProcessor{
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
    throws BeansException {
        System.out.println("Post Process After Initialization method is called : Bean Name " + beanName);
        if(bean instanceof MessageBean)
        {
            MessageBean messageBean = (MessageBean)bean;
            System.out.println("Value of Message is : " + messageBean.getMessage());
        }
        return bean;
    }
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
    throws BeansException {
        System.out.println("Post Process Before Initialization method is called : Bean Name " + beanName);
        if(bean instanceof MessageBean)
        {
            MessageBean messageBean = (MessageBean)bean;
            System.out.println("Value of Message is : " + messageBean.getMessage());
            messageBean.setMessage("Updated Test Message");
        }
        return bean;  }
}
