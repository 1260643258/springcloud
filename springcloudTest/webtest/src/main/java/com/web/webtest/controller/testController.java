package com.web.webtest.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class testController  {

    @RequestMapping("/hello")
    public String hello(){

        List<user> list = new ArrayList<>();
        List<String> aa = new LinkedList<>();
        aa.add("aa");
        aa.add("bb");
        aa.add("cc");
        Iterator<String> cc = aa.iterator();
        ListIterator<String> dd = aa.listIterator();
        while (cc.hasNext())
        {
            cc.next();
            cc.remove();
        }
        String aas = "1";
        aas.compareTo("2");
        aas.equals("2");
        Double cca = 12.1;
        ServiceLocator serviceLocator = new ServiceLocator();
        serviceLocator.getbean();
        Integer [] names = new Integer[]{11,22,33};
        Integer name = contains(names,11);
        return "hello word";
    }

    public <T extends Comparable<T>> T contains(T [] arr,T x)
    {
        for (T val:arr) {
            if (val.equals(x))
            {
                return val;
            }
        }
        return null;
    }

    private class user
    {

    }
}
