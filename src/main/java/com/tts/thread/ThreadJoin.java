package com.tts.thread;
//using Join() and isAlive() method

public class ThreadJoin {

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() ->
        {
            for (int i = 1; i <= 3; i++) {
                System.out.println("hi..");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });

        Thread t2 = new Thread(() ->
        {
            for (int i = 1; i <= 3; i++) {
                System.out.println("hello..");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });

        t1.start();
        try { Thread.sleep(10); } catch (Exception e) {}
        t2.start();
        System.out.println(t1.isAlive());
        t1.join();
        t2.join();
        //isAlive method is used to check thread is alive or not
        System.out.println(t1.isAlive());
        System.out.println("Bye!!");
    }
}
