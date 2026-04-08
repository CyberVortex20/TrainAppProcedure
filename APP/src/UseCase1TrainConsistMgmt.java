import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie{Name='" + name + "', Capacity=" + capacity + "}";
    }
}

public class UC9GroupBogiesByType {
    public static void main(String[] args) {
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("AC Chair", 56));
        Map<String, List<Bogie>> groupedBogies = bogieList.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("--- Train Consist: Grouped by Type ---");
        groupedBogies.forEach((type, list) -> {
            System.out.println("\nCategory: " + type + " (" + list.size() + " bogies)");
            list.forEach(b -> System.out.println("  -> " + b));
        });
    }
}