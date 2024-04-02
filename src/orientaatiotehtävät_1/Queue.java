package orientaatiotehtävät_1;

import java.util.LinkedList;

public class Queue {
    private LinkedList<Customer> customerQueue;

    public Queue() {
        this.customerQueue = new LinkedList<>();
    }

    public void enqueue(Customer customer) {
        customerQueue.addFirst(customer);
    }

    public Customer dequeue() {
        return customerQueue.removeLast();
    }
}
