package spring_framework.wideskills_com.lesson_05.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestCalculation {
    public static void main(String[] args) {

        BeanFactory beanFactory =
                new XmlBeanFactory( new ClassPathResource("SpringFramework/wideskills_com/Lesson_05/beans.xml"));

        Calculation calulation = (Calculation)beanFactory.getBean("calculationBean");
        System.out.println(calulation.getTotal());

        /*
        File file = new File("C:\\jdbcTemplate-beans.xml");
        BeanFactory beanFactoryFile =
                new XmlBeanFactory( new FileSystemResource(file));
        Calculation calulationFile = (Calculation)bean_factory.getBean("calculationBean");
        System.out.println(calulation.getTotal());*/

        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_05/beans.xml");
        DisplayMessage message = (DisplayMessage)context.getBean("displayMessageBean");
        System.out.println(message.getMessage());

        /*
        ApplicationContext contextFile =
                new FileSystemXmlApplicationContext("C:\\jdbcTemplate-beans.xml");
        DisplayMessage messageFile = (DisplayMessage)context.getBean("displayMessageBean");
        System.out.println(message.getMessage());*/


    }
}
