package sfdemo1.demo7;

import sfdemo1.demo6.User;

import java.util.concurrent.Callable;

public class Consumer implements Callable<User> {
    private ProducerConsmerFutureQueue<User> queue;

    public Consumer(ProducerConsmerFutureQueue<User> queue) {
        this.queue = queue;
    }

    @Override
    public User call() throws Exception {
        User user=null;
        for (int i = 0; i <5 ; i++) {
             user = queue.get();

        }
        return user;
    }
}
