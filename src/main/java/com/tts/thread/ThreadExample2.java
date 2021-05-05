package com.tts.thread;
//implementing Runnable interface

class Hey implements Runnable
{

    @Override
    public void run() {
        for(int i=1; i<=5 ; i++){
            System.out.println("Hey..");
            try { Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class ola implements Runnable
{

    @Override
    public void run() {
        for(int i=1; i<=5 ; i++){
            System.out.println("Ola!!");
            try { Thread.sleep(1000);} catch(Exception e){}
        }
    }
}

public class ThreadExample2 {

    public static class myThread extends Thread {

    }
    public static void main(String[] args) {
        Runnable obj1 = new Hey();
        Runnable obj2 = new ola();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try { Thread.sleep(10);} catch(Exception e){}
        t2.start();

    }
}

