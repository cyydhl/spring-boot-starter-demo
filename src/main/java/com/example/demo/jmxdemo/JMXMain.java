package com.example.demo.jmxdemo;

import javax.management.*;
import java.io.IOException;
import java.lang.management.ManagementFactory;

/**
 * Created by Administrator on 2019/7/8.
 */
public class JMXMain {
    public static void main(String[] args) throws MalformedObjectNameException, IOException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
        MBeanServer beanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName on = new ObjectName("com.example.demo.jmxdemo.Mechine:type=mechine");
        MechineMBean mechineMBean = new Mechine();
        beanServer.registerMBean(mechineMBean,on);
        System.in.read();
    }
}
