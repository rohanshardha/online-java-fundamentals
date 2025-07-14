package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */
class NumberPrinter {
    private int number = 1;
    private final int MAX = 100;

    public synchronized void printOdd() {
        while (number <= MAX) {
            while (number % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException ignored) {}
            }
            if (number <= MAX) {
                System.out.println(number);
                number++;
                notifyAll();
            }
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            while (number % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException ignored) {}
            }
            if (number <= MAX) {
                System.out.println(number);
                number++;
                notifyAll();
            }
        }
    }
}

public class Exercise_06 {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        Thread oddThread = new Thread(printer::printOdd, "OddThread");
        Thread evenThread = new Thread(printer::printEven, "EvenThread");

        oddThread.start();
        evenThread.start();
    }
}


//print:: PrintOdd is short hand for 
// new Runnable() {
//     public void run() {
//         printer.printOdd();
//     }
// }