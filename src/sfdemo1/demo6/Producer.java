package sfdemo1.demo6;

import java.util.Date;

public class Producer implements Runnable {
    private ProducerConsumerQueue<User> queue;

    public Producer(ProducerConsumerQueue<User> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            User user=new User();
            user.setId(i);
            user.setId(i);
            queue.put(user);
        }
    }
}
