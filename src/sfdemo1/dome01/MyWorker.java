package sfdemo1.dome01;

import java.util.List;

/*
    需求：
    编写一个线程类，需要继承Thread类，设计一个属性，用于保存一个线程名字；
    设一集合，保存一个所有任务
 */
public class MyWorker  extends Thread{
    private String name;
    private List<Runnable> tasks;

    public MyWorker( String name,  List<Runnable> tasks) {
        super(name);
        this.tasks = tasks;
    }

    //利用构造方法，给变量赋值
    @Override
    public void run() {
        //判断集合中是否有任务，只要有就一直执行
        while (tasks.size()>0){
            Runnable remove = tasks.remove(0);
            remove.run();

        }
    }
}
