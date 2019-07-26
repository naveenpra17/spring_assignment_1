package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanDefinitionStoreException;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.ls.LSOutput;

import javax.naming.Context;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        Movie movie = applicationContext.getBean("movie", Movie.class);
        System.out.println(movie);

        XmlBeanFactory xmlBeanFactory=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        Movie movie1=xmlBeanFactory.getBean("movie",Movie.class);
        System.out.println(movie);
    }
}
