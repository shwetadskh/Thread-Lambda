package com.tts.thread;
//creating Synchronise method so that each thread can access the method at a time

class Counter{
    int count=0 ;
    public synchronized void increment(){
        count++;
    }

    public synchronized int getCount(){
        return count;
    }
}

public class ThreadSync {

    public static void main(String[] args) throws Exception {
        Counter c =new Counter();

        Thread t1 =new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i <=1000 ; i++){
                    c.increment();
                }
               // System.out.println("1st Thread: " +c.getCount());
            }

        });

        Thread t2 =new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=1000 ; i++){
                    c.increment();
                }
               // System.out.println("2nd Thread: " +c.getCount());
            }
        });

        t1.start();
        t1.join();
        System.out.println("1st Thread: " +c.getCount());

        t2.start();
        t2.join();
        System.out.println("2nd Thread: " +c.getCount());

        System.out.println("Thread Name: " + t1.getName());
        //System.out.println("Counter: " + c.count);

    }
}
