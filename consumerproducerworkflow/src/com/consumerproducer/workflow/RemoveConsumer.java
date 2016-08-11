package com.consumerproducer.workflow;

import java.util.concurrent.LinkedBlockingQueue;

public class RemoveConsumer implements Runnable {
	private LinkedBlockingQueue<String> queue;
	private Producer producer;
	
	public RemoveConsumer(LinkedBlockingQueue<String> queue,Producer producer){
		this.producer=producer;
		this.queue=queue;
	}
	public void run(){
		while(producer.isRunning()){
			try{
			System.out.println("Rj\remove "+queue.take());
			Thread.sleep(2000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.print("oc completed");
	}

}
