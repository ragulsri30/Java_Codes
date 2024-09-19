package com.javasample;

public class Multi_Thread implements Runnable{
	
	
		public void run() {
		
		
	}
	
	
    public static void main(String[] args) {
    	Multi_Thread m= new Multi_Thread();
    	
    	Thread t= new Thread(m);
    	
    	t.start();
    }

	
}


