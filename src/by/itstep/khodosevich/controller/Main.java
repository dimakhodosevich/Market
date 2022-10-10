package by.itstep.khodosevich.controller;

import by.itstep.khodosevich.module.entity.Market;
import by.itstep.khodosevich.module.logic.Consumer;
import by.itstep.khodosevich.module.logic.Producer;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        new Producer(market);
        new Consumer(market);

    }
}
