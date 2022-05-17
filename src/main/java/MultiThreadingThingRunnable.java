/**
 * There are two ways in which multithreading can be achieved.
 * 1 . By extending a Thread class.
 * 2. By implementing the Runnable interface.
 */
public class MultiThreadingThingRunnable implements Runnable{


    public MultiThreadingThingRunnable(int threadNumber)
    {
        this.threadNumber = threadNumber;
    }

    private int threadNumber;


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i+" : from Runnable  Number : "+this.threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
