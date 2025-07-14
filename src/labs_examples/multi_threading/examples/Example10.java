package labs_examples.multi_threading.examples;

// Use wait() and notify() to create a ticking clock.

// This program uses two threads (MyThread8 instances named "Tick" and "Tock") that take turns printing "Tick" and "Tock" five times using a shared TickTock object.

// The TickTock class contains the shared state variable, which keeps track of what was printed last ("ticked" or "tocked"). This variable ensures the threads alternate correctly.

// Each thread runs a for loop that calls either tick(true) or tock(true) five times. Inside these methods:

// The if (!running) condition is used only at the end to cleanly exit. It's skipped during normal loop iterations.

// tick(true) prints "Tick ", sets state = "ticked", calls notify() to wake the Tock thread, and then calls wait() until state becomes "tocked".

// tock(true) prints "Tock", sets state = "tocked", calls notify() to wake the Tick thread, and then calls wait() until state becomes "ticked".

// Because the methods are synchronized, only one thread can execute either tick() or tock() at a time. This prevents them from printing at the same time.
// When the tick or the tock thread goes in waiting, it releases the lock on the tt object and as it notified the other thread that thread wakes up and aquires the lock on the tt object.

// After both threads complete five iterations, they each call tick(false) or tock(false) to set the final state and notify the other thread one last time. These false calls don't print anything — they just ensure the other thread isn't left stuck in wait().

class TickTock {

    String state; // contains the state of the clock

    synchronized void tick(boolean running) {
        if(!running) { // stop the clock
            state = "ticked";
            notify(); // notify any waiting threads
            return;
        }

        System.out.print("Tick ");

        state = "ticked"; // set the current state to ticked

        notify(); // let tock() run
        try {
            while(!state.equals("tocked"))
                wait(); // wait for tock() to complete
        }
        catch(InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }

    synchronized void tock(boolean running) {
        if(!running) { // stop the clock
            state = "tocked";
            notify(); // notify any waiting threads
            return;
        }

        System.out.println("Tock");

        state = "tocked"; // set the current state to tocked

        notify(); // let tick() run
        try {
            while(!state.equals("ticked"))
                wait(); // wait for tick to complete
        }
        catch(InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }
}

class MyThread8 implements Runnable {
    Thread thrd;
    TickTock ttOb;

    // Construct a new thread.
    MyThread8(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start(); // start the thread
    }

    // Begin execution of new thread.
    public void run() {

        if(thrd.getName().compareTo("Tick") == 0) {
            for(int i=0; i<5; i++)
                ttOb.tick(true);
            ttOb.tick(false);
        }
        else {
            for(int i=0; i<5; i++)
                ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}

class ThreadCom {
    public static void main(String args[]) {
        TickTock tt = new TickTock();
        MyThread8 mt1 = new MyThread8("Tick", tt);
        MyThread8 mt2 = new MyThread8("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}