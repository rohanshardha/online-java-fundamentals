package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */

 class MYThread  implements Runnable {

    private String threadName;
    MYThread(String name) {
        threadName = name;
    }
    @Override
    public void run() {
        System.out.println("Starting my thread " + threadName);
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(400);
                System.out.println("Hello Rohan on iteration " + i);
            }
        } catch (InterruptedException exe) {
            System.out.println("The thread " + threadName + " has failed executing");
        }
        System.out.println(threadName + " is ended");
    }
}

class Exercise_03 {
    public static void main(String[] args) {
        System.out.println("Starting the main thread");
        MYThread outer = new MYThread("outsideThread");
        Thread rohan = new Thread(outer);
        rohan.setPriority(8);
        rohan.start();
        Thread divisha = new Thread( new MYThread("internalThread"));
        divisha.setPriority(10);
        divisha.start();

        System.out.println("Main thread has ended");
    }
}