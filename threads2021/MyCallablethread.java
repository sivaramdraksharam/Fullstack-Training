package threads2021;

import java.util.concurrent.Callable;

public class MyCallablethread implements Callable<String> {

	private long waitTime;
	
	public MyCallablethread(int timeInMillis){
		this.waitTime=timeInMillis;
	}
	@Override
	public String call() throws Exception {
		Thread.sleep(waitTime);
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
	}

}
