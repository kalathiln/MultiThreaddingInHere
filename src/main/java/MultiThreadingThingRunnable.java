/**
 * There are two ways in which multithreading can be achieved.
 * 2. By implementing the Runnable interface.
 *
 * This is a better approach in case you need the Class using the thread to extend
 * another class which isn't the Thread [Since only a class can be a sub class of only one class].
 * However you can use Runnable and have multiple implementations of interfaces as well as not being a sub class of thread.
 */
public class MultiThreadingThingRunnable implements Runnable{


    public MultiThreadingThingRunnable(int threadNumber)
    {
        this.threadNumber = threadNumber;
    }

    private int threadNumber;

    // You need to override the run method just like we did with the one extending the thread class

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
