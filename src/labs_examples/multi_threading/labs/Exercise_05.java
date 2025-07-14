package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */


 class BankingOps {
    private boolean bankBusy = false;
    synchronized void withdraw() {
        try {
            while(bankBusy) {
                wait();
            }
            bankBusy = true;
            System.out.println("Starting withdrawl");
            Thread.sleep(100);
            bankBusy = false;
            notify();

        } catch (InterruptedException exe) {
            System.out.println(Thread.currentThread().getName() + " failed");
        }

    }
    synchronized void deposit() {
        try {
            while(bankBusy) {
                wait();
            }
            bankBusy = true;
            System.out.println("Starting the deposit process");
            Thread.sleep(100);
            bankBusy = false;
            notify();

        } catch (InterruptedException exe) {
            System.out.println(Thread.currentThread().getName() + " failed");
        }

    }

 }
 class BankThread implements Runnable {
    Thread myThread;
    private BankingOps sharedOps;
    private String clientAction;
    BankThread(String name, String clientAction, BankingOps sharedOps) {
        myThread = new Thread(this, name);
        this.sharedOps = sharedOps;
        this.clientAction = clientAction;
        myThread.start();
    }

    @Override
    public void run() {
        System.out.println(myThread.getName() + " is started");
        if ("Withdraw".equals(clientAction)) {
            for (int i = 100; i < 500; i += 100) {
                sharedOps.withdraw();
                System.out.println("Withdrew " + i + " from the bank");
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted during sleep");
                }
            }
        } else {
            for(int i = 100; i < 500; i += 100) {
                sharedOps.deposit();
                System.out.println("Deposited " + i/5 + " into the bank");
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted during sleep");
                }
            }
        }
        System.out.println(myThread.getName() + " is terminated");
    }
}

class Exercise_05 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " is started");
        BankingOps myBank = new BankingOps();
        BankThread empty1 = new BankThread("John", "Withdraw", myBank);
        BankThread empty2 = new BankThread("Julie", "Deposit", myBank);
        try {
            empty1.myThread.join();
            empty2.myThread.join();
        } catch(InterruptedException exe) {
            System.out.println("An error occured");
            System.out.println(exe.getLocalizedMessage());
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}