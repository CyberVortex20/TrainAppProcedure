import java.util.ArrayList;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UC10TotalSeatsAggregation {
    public static void main(String[] args) {
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Sleeper", 72));

        int totalSeats = bogieList.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("--- Train Capacity Analytics ---");
        System.out.println("Total Bogies: " + bogieList.size());
        System.out.println("Total Seating Capacity: " + totalSeats);
    }
}