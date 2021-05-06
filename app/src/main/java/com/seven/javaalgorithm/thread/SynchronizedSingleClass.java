package com.seven.javaalgorithm.thread;

/**
 *
 * Synchronized(同步锁)
 *
 *  实现单例锁对象
 */
public class SynchronizedSingleClass {
    private static volatile SynchronizedSingleClass instance;

    public SynchronizedSingleClass(){

    }

    public static SynchronizedSingleClass getInstance() {
        if(instance == null){
            //锁类对象 防止cpu调度线程A访问该方法时，立马调度线程B访问该方法，synchronized锁会等线程A执行完以下，线程B才能执行
            synchronized (SynchronizedSingleClass.class){
                if(instance == null){
                    instance = new SynchronizedSingleClass();
                }
            }
        }
        return instance;
    }
}
