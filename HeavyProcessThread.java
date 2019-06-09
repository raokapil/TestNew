package Program;

class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i="+i+" ,ThreadName="+Thread.currentThread().getName());
        }
    }
}

class MyRunnable2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i="+i+" ,ThreadName="+Thread.currentThread().getName());
        }
    }
}


public class HeavyProcessThread {

public static void main(String[] args) {
    //MyRunnable1 runnable1 = new MyRunnable1();

    Thread t1 = new Thread(new MyRunnable1(), "Thread-1");
    Thread t2 = new Thread(new MyRunnable2(), "Thread-2");

    t1.start();
    t2.start();
}
}
