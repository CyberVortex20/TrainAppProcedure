import java.util.HashMap;
import java.util.Map;

public class UC6MapBogietoCapacity {
    public static void main(String[] args) {
        HashMap<String, Integer> bogieCapacities = new HashMap<>();

        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair Car", 56);
        bogieCapacities.put("First Class", 24);

        System.out.println("--- Train Bogie Capacity Mapping ---");

        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }
    }
}