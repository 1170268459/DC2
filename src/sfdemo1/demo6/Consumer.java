package sfdemo1.demo6;

public class Consumer implements Runnable{
    private ProducerConsumerQueue<User> queue;

    public Consumer(ProducerConsumerQueue<User> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            User user = queue.get();
            System.out.println(user.getId());
        }
    }
}
