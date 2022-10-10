package by.itstep.khodosevich.module.logic;

import by.itstep.khodosevich.module.entity.Market;

import java.util.concurrent.TimeUnit;

public class Producer implements Runnable{
    private Market market;
    private Thread thread;
    private volatile boolean running;

    public Producer(Market market) {
        running = true;
        this.market = market;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int product = 0;
        while (running){
            product++;
            market.sendProduct(product);
            try{
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public void stop(){
        running = false;
    }
}
