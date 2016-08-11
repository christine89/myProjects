package com.consumerproducer.workflow;

import java.util.concurrent.LinkedBlockingQueue;

public class Consumer implements Runnable {
	private LinkedBlockingQueue<String> queue;
	private Producer producer;
	public Consumer(LinkedBlockingQueue<String> queue, Producer producer){
		this.producer=producer;
		this.queue=queue;
		
}
	@Override
	public void run(){
		while(producer.isRunning()){
			System.out.println("CJ\\       Adding job  "+queue);
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		
		}
		
		System.out.print("Final jobs in the queue"+queue);
	}
	
}
