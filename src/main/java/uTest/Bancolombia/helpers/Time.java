package uTest.Bancolombia.helpers;

public class Time {
    public static void waiting(int waiting) {
        try {
            Thread.sleep(Long.parseLong(String.valueOf(waiting)));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
