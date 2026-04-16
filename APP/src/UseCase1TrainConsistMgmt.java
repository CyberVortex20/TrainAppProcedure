import java.util.*;
import java.util.stream.*;

public class UC13PerformanceComparision {

    static class Bogie {
        int capacity;

        Bogie(int capacity) {
            this.capacity = capacity;
        }

        int getCapacity() {
            return capacity;
        }
    }

    public static List<Bogie> loopFilter(List<Bogie> bogies) {
        List<Bogie> result = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                result.add(b);
            }
        }
        return result;
    }

    public static List<Bogie> streamFilter(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            bogies.add(new Bogie(i % 100));
        }

        long startLoop = System.nanoTime();
        List<Bogie> loopResult = loopFilter(bogies);
        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        long startStream = System.nanoTime();
        List<Bogie> streamResult = streamFilter(bogies);
        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        System.out.println(loopResult.size());
        System.out.println(streamResult.size());
        System.out.println(loopTime);
        System.out.println(streamTime);
    }
}