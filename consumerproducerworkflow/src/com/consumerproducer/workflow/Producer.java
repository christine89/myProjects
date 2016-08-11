package com.consumerproducer.workflow;
/*@ author Christine Momanyi
 * @created 5th may, 2015
 */


import java.util.concurrent.LinkedBlockingQueue;

public class Producer implements Runnable {
	private LinkedBlockingQueue<String> queue;
	private boolean running;
	
	public Producer(LinkedBlockingQueue<String> queue){
		this.queue=queue;
		this.running=true;
	}
	// we need to check if the  producer thread is still running and this method
	//will return the  state
	public boolean isRunning(){
		return running;
	}
	 @Override
	public void run(){
		for(int i=0;i<15;i++){
			String job="Job "+i;
			try{
				queue.put(job);
				System.out.println(" \\ adding "+ job+ "  to the queue");
				Thread.sleep(1000);;
			
			}catch(InterruptedException e){
			e.printStackTrace();
			}
		}
		System.out.println("jobs completed");
		running=false;
		
	}
	

}
