package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware , BeanNameAware, BeanFactoryAware {
    public static ApplicationContext applicationContext = null;

    private BeanFactory beanFactory;

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    private Actor actor;

    public Movie() {
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    @Override//Implementing ApplicationContextAware,
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
//        System.out.printf(applicationContext.toString() );
     }


    @Override//implementing BeamNameAware
    public void setBeanName(String s) {
//         System.out.println("bean name is" + s);
    }

    @Override//implementing beanfactoryname
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    this.beanFactory=beanFactory;
//        System.out.println(beanFactory+" bean factory");
    }
}
