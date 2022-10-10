package by.itstep.khodosevich.module.logic;

import by.itstep.khodosevich.module.entity.Market;

import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {
    private Market market;
    private Thread thread;
    private volatile boolean running;

    public Consumer(Market market) {
        running = true;
        this.market = market;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        while (running) {
            if (!market.getEmpty()) {
                market.getProduct();
                market.setEmpty(true);
            }
        }
    }


    public void stop() {
        running = false;
    }
}

