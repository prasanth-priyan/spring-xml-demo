package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ) throws Exception {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifecycleDemoBean demoBean = context.getBean("lifecycledemo", BeanLifecycleDemoBean.class);
        System.out.println("LifeCycle Demo");
        context.close();
    }
}
