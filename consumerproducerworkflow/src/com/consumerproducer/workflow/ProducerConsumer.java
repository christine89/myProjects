package com.consumerproducer.workflow;

import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer {
	public static void main(String args[]){
		LinkedBlockingQueue<String> queue=new LinkedBlockingQueue<String>(10);
		Producer producer =new Producer(queue);
		Consumer consumer=new Consumer(queue,producer);
		RemoveConsumer rConsumer=new RemoveConsumer(queue,producer);
		
		Thread producerThread=new Thread(producer);
		Thread consumerThread=new Thread(consumer);
		Thread rConsumerThread=new Thread(rConsumer);
		
		
		producerThread.start();
		consumerThread.start();
		rConsumerThread.start();
		
		
		
		
	}

}
