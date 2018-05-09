package RecursiveProgrammingEmaples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

@SuppressWarnings("serial")
public class CustomRecursiveTask2 extends RecursiveTask<Integer> {
    private int[] arr;
 
    private static final int THRESHOLD = 20;
 
    public CustomRecursiveTask2(int[] arr) {
        this.arr = arr;
    }
 
    @Override
    protected Integer compute() {
        if (arr.length > THRESHOLD) {
            return ForkJoinTask.invokeAll(createSubtasks())
              .stream()
              .mapToInt(ForkJoinTask::join)
              .sum();
        } else {
            return processing(arr);
        }
    }
 
    private Collection<CustomRecursiveTask2> createSubtasks() {
        List<CustomRecursiveTask2> dividedTasks = new ArrayList<>();
        dividedTasks.add(new CustomRecursiveTask2(
          Arrays.copyOfRange(arr, 0, arr.length / 2)));
        dividedTasks.add(new CustomRecursiveTask2(
          Arrays.copyOfRange(arr, arr.length / 2, arr.length)));
        return dividedTasks;
    }
 
    private Integer processing(int[] arr) {
        return Arrays.stream(arr)
          .filter(a -> a > 0 && a < 100000)
          .map(a -> a)
          .sum();
    }
}