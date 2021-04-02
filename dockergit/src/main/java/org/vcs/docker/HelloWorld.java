package org.vcs.docker;

public class HelloWorld {
	
	public static void main(String args[]) throws Exception{
		for(int i = 0 ; i < 100; i++){
			System.out.println("Hello World Ping VCS-UPD: " + i );
			Thread.sleep(1000);
		}
	}

}
