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
//        Movie movie = applicationContext.getBean("movie", Movie.class);//For the Movie bean, use constructor based object injection in the bean definition file(beans.xml) to inject an Actor bean.
//
////        System.out.println(movie);//printinh actor info using movie bean
//        Movie movie1=applicationContext.getBean("movie",Movie.class);//Same bean
////        System.out.println(movie1);
//
////        System.out.println(movie==movie1);//both are of same beans heance reeturns true
//
//        //Chaning the scope of the Movie bean in beans.xml to prototype
//        Movie movie2=applicationContext.getBean("movie1",Movie.class);
//        Movie movie3=applicationContext.getBean("movie1",Movie.class);
////        System.out.println(movie2==movie3);

//          System.out.println(movie6);
    }
}
