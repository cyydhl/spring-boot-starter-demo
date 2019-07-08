package com.example.demo.jmxdemo;

/**
 * Created by Administrator on 2019/7/8.
 */
public interface MechineMBean {
    public int getCpuCore();
    public long getFreeMemory();
    public void shutdown();
}
