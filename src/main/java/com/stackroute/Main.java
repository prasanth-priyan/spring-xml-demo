package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie baahubali1 = context.getBean("movie1", Movie.class);
        baahubali1.starring();

        Movie baahubali2 = context.getBean("movie2", Movie.class);
        baahubali2.starring();

        System.out.println(baahubali1==baahubali2);
    }
}
