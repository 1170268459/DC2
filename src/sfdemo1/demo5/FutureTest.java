package sfdemo1.demo5;

import java.util.LinkedList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<LinkedList<Feeback>> f=executorService.submit(new FutureDemo2());
        boolean done = f.isDone();
        System.out.println("第一次判断任务是否完成："+done);
        boolean cancelled = f.isCancelled();
        System.out.println("第一次判断任务是否取消:"+cancelled);
        LinkedList<Feeback> feebacks = f.get();

        boolean done1 = f.isDone();
        System.out.println("第二次判断任务是否完成："+done1);

        boolean cancelled1 = f.isCancelled();
        System.out.println("第二次判断任务是否取消："+cancelled1);


    }
}
