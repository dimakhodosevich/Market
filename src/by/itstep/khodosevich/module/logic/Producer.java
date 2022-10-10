package by.itstep.khodosevich.module.logic;

import by.itstep.khodosevich.module.entity.Market;

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
        }
    }

    public void stop(){
        running = false;
    }
}
