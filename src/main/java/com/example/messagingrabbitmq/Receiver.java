package com.example.messagingrabbitmq;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class Receiver {
    private CountDownLatch latch = new CountDownLatch(1);
    public void receiveMessage(String message){
        System.out.println("Received <"+message+">");
        latch.countDown();
        System.out.println(latch);
    }
    public  CountDownLatch getLatch(){
        return latch;
    }
}
