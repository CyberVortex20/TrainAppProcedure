import java.util.Scanner;

public class UC18 {

    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        Scanner sc = new Scanner(System.in);

        String searchKey = sc.nextLine();

        boolean found = linearSearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie Found");
        } else {
            System.out.println("Bogie Not Found");
        }

        sc.close();
    }
}