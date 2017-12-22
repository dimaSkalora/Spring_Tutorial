package spring_framework.wideskills_com.lesson_07.java_config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_framework.wideskills_com.lesson_07.java_config.CustomLifeCycleMehodBean;

@Configuration
public class InitMethodDestroyMethodBeans {
    @Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    public CustomLifeCycleMehodBean customLifeCycleMehodBean(){
        CustomLifeCycleMehodBean customLifeCycleMehodBean = new CustomLifeCycleMehodBean();
        customLifeCycleMehodBean.setName("custom methods bean");
        return customLifeCycleMehodBean;
    }

}
