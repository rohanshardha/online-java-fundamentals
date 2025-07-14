package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
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

class Exercise_01 {
    public static void main(String[] args) {
        System.out.println("Starting the main thread");
        MYThread outer = new MYThread("outsideThread");
        Thread rohan = new Thread(outer);
        rohan.start();
        Thread divisha = new Thread( new MYThread("internalThread"));
        divisha.start();

        System.out.println("Main thread has ended");
    }
}