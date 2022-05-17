public class MultiThreadingClass {

    public static void main(String[] args) {

        System.out.println("Starting the Threads using Thread class!!! ");
        for (int i = 0; i < 3; i++) {
            MultiThreadingThingThread multiThreadingThingThread = new MultiThreadingThingThread(i);
           multiThreadingThingThread.start();
        }
        System.out.println("Starting the Threads using Runnable");
        for (int i = 0; i < 3; i++) {
            MultiThreadingThingRunnable multiThreadingThingRunnable = new MultiThreadingThingRunnable(i);
            /*
             While using runnable we need to create a new thread object using the thread class,
             Wherein we are passing the runnable object as the argument.
             */
            Thread myThread = new Thread(multiThreadingThingRunnable);
           myThread.start();
        }


    }
}
