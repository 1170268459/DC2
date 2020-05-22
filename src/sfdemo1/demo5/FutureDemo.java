package sfdemo1.demo5;

import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<Integer> f=executorService.submit(new MyCall(2,5));
        //判断是否已经完成
        boolean done = f.isDone();
        System.out.println("第一次判断是否完成任务："+done);
        //
        boolean cancelled = f.isCancelled();
        System.out.println("第一次判断任务是否取消："+cancelled);
        Integer b = f.get();
        System.out.println("任务的允许结果："+b);
        boolean fDone = f.isDone();
        System.out.println("第二次判断任务是否完成："+fDone);

        boolean cancelled1 = f.isCancelled();
        System.out.println("第二次判断任务是否取消："+cancelled1);

    }
}

class MyCall implements Callable<Integer>{

    private int a;
    private int b;

    public MyCall(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {

        String name = Thread.currentThread().getName();//等到线程名字
        System.out.println(name+"准备开始计算。。。。。。。。。");
        Thread.sleep(2000);
        System.out.println(name+"计算。。。。。");
        return a+b;
    }
}