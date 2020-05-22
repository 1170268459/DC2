package sfdemo1.dome01;

public class MyTask implements Runnable {
    private int id;

    public MyTask(int id) {
        this.id = id;
    }

    //由于run方法是重写接口方法，利用构造方法进行初始化
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("线程："+name+"即将执行任务："+id);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程："+name+"完成了任务:"+id);
    }
}
