package com.web.webtest.controller;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ServiceLocator implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)throws BeansException {
        ServiceLocator.applicationContext = applicationContext;
    }

    public void getbean()
    {
        Map<String, Comparable> map = applicationContext.getBeansOfType(Comparable.class);
        System.out.println("123");
    }
}
