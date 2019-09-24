package com.stackroute;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie baahubali = (Movie) factory.getBean("movie");
        baahubali.starring();

        BeanDefinitionRegistry registry = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
        BeanFactory beans = (BeanFactory) reader.getRegistry();
        Movie baahubali2 = (Movie) beans.getBean("movie");
        baahubali2.starring();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie baahubali3 = context.getBean("movie", Movie.class);
        baahubali3.starring();
    }
}
