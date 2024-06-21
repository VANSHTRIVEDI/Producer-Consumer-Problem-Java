package Properties_Of_Oops.MultiThreading.Producer_Consumer.UsingObjectAsBlock;

import java.util.*;

public class Company {
    Queue<Integer> q;
    int capacity;

    Company(int capacity) {
        this.capacity = capacity;
        q = new LinkedList<>();
    }

    public boolean add(int element) throws InterruptedException {
        synchronized (q) {
            // we will use while because their can be a case when more than 1 Thread will be
            // waiting
            // so It should check everytime before goind to execute
            while (q.size() == capacity) {
                q.wait(); // thread will wait here

            }
            q.add(element);
            q.notifyAll();
            return true;
        }
    }

    public int remove() throws InterruptedException {
        synchronized (q) {
            while (q.size() == 0) {
                q.wait();

            }
            int element = q.remove();
            q.notifyAll();
            return element;
        }
    }
}
