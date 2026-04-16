import java.util.Arrays;

public class UC17 {

    public static void main(String[] args) {

        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        Arrays.sort(bogieNames);

        for (int i = 0; i < bogieNames.length; i++) {
            System.out.println(bogieNames[i]);
        }
    }
}