package com.AbstractClass;

import java.io.IOException;
import java.io.PrintWriter;

public class CmdTest {

	public static void main(String[] args) throws IOException {
		String[] command =
		    {
		        "cmd",
		    };
		    Process p;
			try {
				p = Runtime.getRuntime().exec(command);
			        new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
		                new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
		                PrintWriter stdin = new PrintWriter(p.getOutputStream());
		                stdin.println("start calc");
		                stdin.close();
		                p.waitFor();
		    	} catch (Exception e) {
		 		e.printStackTrace();
			}
		}	
}
