package Properties_Of_Oops.MultiThreading.Producer_Consumer.UsingRunnableInterFace;

public class Company {
    int item;
    boolean run;

    // run=false: chance: producer
    // run=true: chance :consumer

    public synchronized void produce(int n) throws Exception {
        if (run) {
            wait();
        }
        this.item = n;
        System.out.println("Produced : " + item);
        run = true;
        notify();
    }

    public synchronized int consume() throws Exception {
        if (!run) {
            wait();
        }
        System.out.println("Consumed : " + item);
        run = false;
        notify();
        return this.item;
    }
}
