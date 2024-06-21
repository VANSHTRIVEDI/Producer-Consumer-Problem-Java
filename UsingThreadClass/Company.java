package Properties_Of_Oops.MultiThreading.Producer_Consumer.UsingThreadClass;

public class Company {
    int item;

    boolean run;
    // volatile boolean run;
    // we can use volatile but its is not needed here because
    // Synchronization ensures that any change to run made by one thread is visible
    // to other threads after they exit the synchronized block.
    // because they are sharing the same block

    // run=false: chance: producer
    // run=true: chance :consumer

    public synchronized void produce(int n) throws Exception {
        if (run) {
            wait();
        }
        this.item = n;
        System.out.println("Produced : " + item);
        run = true;
        notifyAll();
    }

    public synchronized int consume() throws Exception {
        if (!run) {
            wait();
        }
        System.out.println("Consumed : " + item);
        run = false;
        notifyAll();
        return this.item;
    }
}
