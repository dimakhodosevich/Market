package by.itstep.khodosevich.controller;

import by.itstep.khodosevich.module.entity.Market;
import by.itstep.khodosevich.module.logic.Consumer;
import by.itstep.khodosevich.module.logic.Producer;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        TimeUnit.SECONDS.sleep(2);

        producer.stop();
        consumer.stop();

    }
}
