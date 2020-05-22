package sfdemo1.dome01;

/***
 * 测试类;'
 *   1.创建线程池类。
 *   2.提交多个任务
 */
public class MyTest {
    public static void main(String[] args) {
        MyThreadPool pool=new MyThreadPool(2,4,20);
        for (int i = 0; i <1000 ; i++) {
            //3.创建任务对象，并提交线程池
            MyTask myTask=new MyTask(i);
            pool.submit(myTask);
        }
    }
}
