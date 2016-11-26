package com.ksit.test.threadAndSche;

import java.util.concurrent.*;

/**
 * Created by hanxiaowei on 2016/11/17.
 */
public class ScheduledExecutorServiceTest {

    public static void main(String[] a){
        System.out.println("start");
        BeeperControl beeperControl = new BeeperControl();

        beeperControl.beepForAnHour();

    }


    static class BeeperControl{
        private final ExecutorService schdule =
                Executors.newSingleThreadExecutor();
        public void beepForAnHour(){
            final Runnable beeper = new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+":beep....");
                    throw new RuntimeException("");
                }
            };


            final ScheduledFuture<?> beeperHandler =
                    schdule.invokeAny().scheduleAtFixedRate(beeper,4,2, TimeUnit.SECONDS);



        }

    }

}
