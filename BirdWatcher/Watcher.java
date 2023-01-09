package BirdWatcher;

import java.util.Arrays;

public class Watcher {
    public static void main(String[] args) {
        int[] birdsLastWeek = {2, 3, 5, 6, 0, 8, 5};
        BirdWatcher lastWeekWatch = new BirdWatcher(birdsLastWeek);
        System.out.println(Arrays.toString(lastWeekWatch.getLastWeek()));
        System.out.println(lastWeekWatch.getToday());
        lastWeekWatch.incrementTodaysCount();
        System.out.println(lastWeekWatch.getToday());
        System.out.println(lastWeekWatch.hasDayWithoutBirds());
        System.out.println(lastWeekWatch.getCountForFirstDays(4));
        System.out.println(lastWeekWatch.getBusyDays());
    }
}
