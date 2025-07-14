package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */
class Printer {
    public synchronized void printDoc(String doc) {
        System.out.println("Starting to print the document:" + doc);
        
        try {
            for (int i = 0; i < 5; i ++) {
                System.out.println("Printing page " + i + " of " + doc);
                Thread.sleep(500);
            }
        }catch (InterruptedException exe) {
            System.out.println("Some error occured while printing in " + Thread.currentThread().getName());
            return;
        }
        
        System.out.println("finished printing " + doc + " in " + Thread.currentThread().getName());
    }

    public void printFooter(String doc) {
    synchronized (this) {
        System.out.println("Also printed  footer for " + doc + " in " + Thread.currentThread().getName());
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            System.out.println("Error printing footer in " + Thread.currentThread().getName());
        }
        System.out.println("Finished printing footer for " + doc);
    }
}

}

class ExampleThrd implements Runnable {

    Thread myThread;
    Printer sharedPrinter;
    private String docName;
    ExampleThrd(String name, String docName, Printer sharedPrinter) {
        myThread = new Thread(this, name);
        this.docName = docName;
        this.sharedPrinter = sharedPrinter;
        myThread.start();
    }

    @Override
    public void run() {
        System.out.println("Starting the thread " + myThread.getName());
        sharedPrinter.printDoc(docName);
        sharedPrinter.printFooter(docName);
        System.out.println(myThread.getName() + " is finished executing");
    }
}
class Exercise_04 {
    public static void main(String[] args) {
        System.out.println("Starting the thread " + Thread.currentThread().getName());
        Printer myPrinter = new Printer();
        ExampleThrd empty1 = new ExampleThrd("Juli", "Income Statement", myPrinter);
        ExampleThrd empty2 = new ExampleThrd("John", "Balance Sheet", myPrinter);
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}