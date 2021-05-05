
package com.tts.thread;
//using anonymous class and lambda expression code will be less and more efficient


public class ThreadLambda {
    public static void main(String[] args) {

        Thread t1 =new Thread(() ->
        {
            for(int i=0 ;i<=5 ; i++){
                System.out.println("Hey..");
                try{ Thread.sleep(1000);} catch(Exception e) {}
            }
        });

        Thread t2 =new Thread(() ->
        {
            for(int i=0 ; i<=5 ; i++){
                System.out.println("Ola!");
                try{ Thread.sleep(1000); } catch (Exception e) {}
            }
        });
        t1.start();
        try{ Thread.sleep(10); } catch (Exception e) {}
        t2.start();

    }
}
