package com.ctrip.xpipe.exception;

import org.junit.Test;

import com.ctrip.xpipe.AbstractTest;

/**
 * @author wenchao.meng
 *
 * Aug 16, 2016
 */
public class GlobalExceptionHandlerTest extends AbstractTest{
	
	@Test
	public void test(){
		
		Thread.setDefaultUncaughtExceptionHandler(new GlobalExceptionHandler());
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				throw new IllegalStateException();
			}
		});
		
		t.setName("runThread");
		t.start();
		
	}

}
