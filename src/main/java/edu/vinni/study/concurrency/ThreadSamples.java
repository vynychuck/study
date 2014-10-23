package edu.vinni.study.concurrency;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author anton.v.filimonov@gmail.com
 * @since 21.10.2014
 */
public class ThreadSamples {
    public static void main(String[] args) throws InterruptedException {

        final Storage storage = new Storage();

        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    add(i);
                }
            }

            private void add(int i) {
                try {
                    storage.add(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Adder").start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    remove();
                }
            }

            private void remove() {
                try {
                    storage.poll();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Poller").start();


    }
}


class Storage {
    private final Queue<Integer> list = new PriorityQueue<>();
    private final int limit = 5;

    public synchronized void add(int value) throws InterruptedException {
        System.out.println("Adding value: " + value);
        if (list.size() >= limit) {
            System.out.println("Queue is full, waiting...");
            wait();
        }
        notifyAll();
        list.offer(value);
    }

    public synchronized void poll() throws InterruptedException {
        System.out.println("Polling value: ");
        if (list.size() == 0) {
            System.out.println("Queue is empty, waiting...");
            wait();
        }
        notifyAll();
        list.poll();
    }
}
