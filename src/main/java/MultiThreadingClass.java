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
            Thread myThread = new Thread(multiThreadingThingRunnable);
           myThread.start();
        }


    }
}
