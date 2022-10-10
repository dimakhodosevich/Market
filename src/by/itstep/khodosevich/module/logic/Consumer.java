package by.itstep.khodosevich.module.logic;

import by.itstep.khodosevich.module.entity.Market;

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
            market.getProduct();
        }
    }

    public void stop() {
        running = false;
    }
}

