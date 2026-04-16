import java.util.Scanner;

public class UC20 {

    public static boolean linearSearch(String[] bogies, String key) {

        for (int i = 0; i < bogies.length; i++) {
            if (bogies[i].equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogies = {};

        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();

        try {

            if (bogies.length == 0) {
                throw new IllegalStateException("No bogies available for search");
            }

            boolean result = linearSearch(bogies, key);

            if (result) {
                System.out.println("Bogie Found");
            } else {
                System.out.println("Bogie Not Found");
            }

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}