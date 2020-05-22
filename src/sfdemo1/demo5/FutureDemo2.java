package sfdemo1.demo5;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureDemo2 implements Callable<LinkedList<Feeback>> {

    private LinkedList<Feeback> feebackLinkedList;
    private static Integer count = 0;
    private static final Integer Full = 10;
    private static String LOCK = "lock";


    @Override
    public LinkedList<Feeback> call() throws Exception {
        Producer producer = new Producer();
        LinkedList<Feeback> call = producer.call();

        return call;
    }


   /* public String ProducerTest() {

        return "生产者";
    }

    public String ConsumerTest() {

        return "消费者";
    }*/

    class Producer implements Callable<LinkedList<Feeback>> {

        @Override
        public LinkedList<Feeback> call() throws Exception {

            Feeback feeback = new Feeback();
            for (int i = 0; i < 5; i++) {
                synchronized (LOCK) {
                    while (count == Full) {
                        feeback.setM(45);
                        feeback.setS(55);
                        feebackLinkedList.add(feeback);
                        LOCK.wait();
                    }
                }
                count++;
                System.out.println(Thread.currentThread().getName() + "生产者，目前总共有" + count);
                LOCK.notifyAll();
            }
            return feebackLinkedList;
        }
    }

    class Consumer implements Callable<LinkedList<Feeback>> {
        @Override
        public LinkedList<Feeback> call() throws Exception {
            for (int i = 0; i < 5; i++) {
                synchronized (LOCK) {
                    while (count == 0) {
                        feebackLinkedList.get(i);
                        feebackLinkedList.remove(i);
                        LOCK.wait();
                    }
                }
            }
            count--;
            System.out.println(Thread.currentThread().getName() + "生产者，目前总共有" + count);
            LOCK.notifyAll();
            return feebackLinkedList;
        }
    }
}
