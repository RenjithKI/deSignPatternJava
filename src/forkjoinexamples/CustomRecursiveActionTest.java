package forkjoinexamples;

import java.util.concurrent.ForkJoinPool;

public class CustomRecursiveActionTest {

	/**
	 * @param args
	 * http://www.baeldung.com/java-fork-join
	 */
	public static void main(String[] args) {

		ForkJoinPool commonPool = ForkJoinPool.commonPool();

		ForkJoinPool forkJoinPool = PoolUtil.forkJoinPool;
		
		//4. Submitting Tasks to the ForkJoinPool
		String workload = "In the example below, the unit of work to be processed is represented by a String called workload. For demonstration purposes, the task is a nonsensical one: it simply uppercases its input and logs it demonstrate the forking behavior of the framework, the example splits the task if workload.length() is larger than a specified threshold using the createSubtask() method.  e String is recursively divided into substrings, creating CustomRecursiveTask instances which are based on these substrings. As a result, the method returns a List<CustomRecursiveAction>. The list is submitted to the ForkJoinPool using the invokeAll() method:";

		CustomRecursiveAction customRecursiveAction = new CustomRecursiveAction(workload);
		
		//4. Submitting Tasks to the ForkJoinPool
		
		forkJoinPool.execute(customRecursiveAction);
		Void result = customRecursiveAction.join();

	}

}
