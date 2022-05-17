/**
 * There are two ways in which multithreading can be achieved.
 * 1 . By extending a Thread class.
 * 2. By implementing the Runnable interface.
 */
public class MultiThreadingThingThread extends Thread{


    public MultiThreadingThingThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    private int threadNumber;


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i+" : from Thread Number : "+this.threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
