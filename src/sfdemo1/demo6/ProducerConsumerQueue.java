package sfdemo1.demo6;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 实现缓存区
 * @param <User>
 */
public class ProducerConsumerQueue<User> {
    private final static int QUEUE_MAX_SIZE=5;

    private Queue<User> queue;

    public ProducerConsumerQueue() {
       queue=new LinkedList<User>();
    }

    public synchronized boolean put(User user){
        while (queue.size()==QUEUE_MAX_SIZE){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.offer(user);
        System.out.println(Thread.currentThread().getName()+"->生产元素，元素总数为"+queue.size());
        notify();
        return true;
    }

    public synchronized User get(){
        while (queue.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        User user=queue.poll();
        System.out.println(Thread.currentThread().getName()+"消费了一个，元素总数为"+queue.size());
        notify();
        return user;
    }
}
