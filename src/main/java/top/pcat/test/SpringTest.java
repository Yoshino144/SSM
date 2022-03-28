package top.pcat.test;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import top.pcat.SpringConfig;
import top.pcat.entity.Department;
import top.pcat.entity.Employee;
import top.pcat.entity.LiveTime;
import top.pcat.factory.BeanFactory;

public class SpringTest {

    @Test
    public void getIOC(){

        //ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);

        Employee liveTime = ioc.getBean("zs", Employee.class);
        System.out.println(liveTime.getEmpName());

        }

}
