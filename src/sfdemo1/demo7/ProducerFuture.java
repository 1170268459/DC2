package sfdemo1.demo7;

import sfdemo1.demo6.User;

import java.util.concurrent.Callable;

public class ProducerFuture implements Callable<User> {

    private ProducerConsmerFutureQueue<User> queue;

    public ProducerFuture(ProducerConsmerFutureQueue<User> queue) {
        this.queue = queue;
    }

    @Override
    public User call() throws Exception {
        User user=new User();
        for (int i = 0; i <5 ; i++) {
            user.setId(i);
            user.setUsername(i+5);
            System.out.println(user.getId());
            queue.put(user);
        }
        return user;
    }
}
