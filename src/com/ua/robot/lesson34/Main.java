package com.ua.robot.lesson34;

//import java.util.concurrent.Callable;
//import java.util.concurrent.Executor;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Future;

import java.util.concurrent.*;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Callable<Integer>> callables = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            callables.add(new RandomCallable());
        }

        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        List<Future<Integer>> futures = executorService.invokeAll(callables);
        List<Future<Integer>> futures = new ArrayList<>();
        callables.forEach(callable -> futures.add(executorService.submit(callable)));
        for (Future<Integer> future : futures) {
            System.out.print(future.get() + " ");
        }

        executorService.shutdown();
    }
}
