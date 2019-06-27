package com.web.webtest.controller;

public class MyThread implements Runnable  {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"aaa");
    }
}
