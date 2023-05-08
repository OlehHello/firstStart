package com.ua.robot.lesson34;

import java.util.concurrent.Callable;

public class RandomCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return (Integer) (int) (Math.random() * 50 + 1);
    }
}
