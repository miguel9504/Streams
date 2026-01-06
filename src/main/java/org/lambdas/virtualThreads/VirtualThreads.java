package org.lambdas.virtualThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreads {

	ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

	Runnable thread1 = () -> {

	};

	public ExecutorService getExecutor() {
		return executor;
	}

	public void setExecutor(ExecutorService executor) {
		this.executor = executor;
	}

}
