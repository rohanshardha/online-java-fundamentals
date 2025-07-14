package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

 class ExampleThread extends Thread {
    //private String threadName;
    ExampleThread(String name) {
super(name);
start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " is initiating");
        try {
            for (int a = 0; a < 5; a++) {
                Thread.sleep(500);
                System.out.println("Hello from " + getName() + " on iteration " + a);
            }
        } catch (InterruptedException exe) {
            System.out.println(getName() + " failed!");
        }
        System.out.println(getName() + " terminated");
    }
 }

 class Exerrcise_02 {
    public static void main(String[] args) {
        System.out.println("Starting the main thread");
        ExampleThread rohan = new ExampleThread(("workerThread"));
        System.out.println("Main thread terminated");
    }
 }