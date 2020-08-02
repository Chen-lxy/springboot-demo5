package com.chen.study.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ListenerDemo1 implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // 创建时的逻辑
        System.out.println("ServletContext初始化>>>>>>>>>>>>>>>>");
        System.out.println(sce.getServletContext().getServerInfo());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext销毁了>>>>>>>>>>>>>>>>>>>>>");
    }
}
