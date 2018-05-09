package RecursiveProgrammingEmaples;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.logging.Logger;

/**
 * @author Renjith
 * http://www.baeldung.com/java-fork-join
 *
 */
public class CustomRecursiveAction extends RecursiveAction {
	 
    private String workload = "";/*"In the example below, the unit of work to be processed is represented by a String called workload. For demonstration purposes, the task is a nonsensical one: it simply uppercases its input and logs it demonstrate the forking behavior of the framework, the example splits the task if workload.length() is larger than a specified threshold using the createSubtask() method.  e String is recursively divided into substrings, creating CustomRecursiveTask instances which are based on these substrings. As a result, the method returns a List<CustomRecursiveAction>. The list is submitted to the ForkJoinPool using the invokeAll() method:";*/
    private static final int THRESHOLD = 100;
 
    private static Logger logger = 
      Logger.getAnonymousLogger();
 
    public CustomRecursiveAction(String workload) {
        this.workload = workload;
    }
 
    @Override
    protected void compute() {
        if (workload.length() > THRESHOLD) {
            ForkJoinTask.invokeAll(createSubtasks());
        } else {
           processing(workload);
        }
    }
 
    private List<CustomRecursiveAction> createSubtasks() {
        List<CustomRecursiveAction> subtasks = new ArrayList<>();
 
        String partOne = workload.substring(0, workload.length() / 2);
        String partTwo = workload.substring(workload.length() / 2, workload.length());
 
        subtasks.add(new CustomRecursiveAction(partOne));
        subtasks.add(new CustomRecursiveAction(partTwo));
 
        return subtasks;
    }
 
    private void processing(String work) {
        String result = work.toUpperCase();
        logger.info("This result - (" + result + ") - was processed by "
          + Thread.currentThread().getName());
    }
}