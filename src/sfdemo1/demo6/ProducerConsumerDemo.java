package sfdemo1.demo6;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerDemo {
   private final  static ExecutorService service= Executors.newCachedThreadPool();

    public static void main(String[] args) throws InterruptedException {
        Random random=new Random();
        ProducerConsumerQueue<User> queue=new ProducerConsumerQueue<>();
        Producer producer=new Producer(queue);
        Consumer consumer=new Consumer(queue);
        /*for (int i = 0; i <3 ; i++) {*/
            Thread.sleep(random.nextInt(50));
            service.submit(producer);
        /*}*/
       /* for (int i = 0; i <3 ; i++) {*/
            Thread.sleep(random.nextInt(50));
            service.submit(consumer);
        /*}*/
        service.shutdown();
    }
}
