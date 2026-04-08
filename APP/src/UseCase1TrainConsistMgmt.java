import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UC11ValidateTrainIDAndCargo {
    public static void main(String[] args) {
        String[] testTrainIDs = {"TRN-1234", "TRAIN12", "TRN12A", "TRN-9999", "1234-TRN"};
        String[] testCargoCodes = {"PET-AB", "PET-ab", "PET123", "PET-XY", "AB-PET"};

        String trainIDRegex = "TRN-\\d{4}";
        String cargoCodeRegex = "PET-[A-Z]{2}";

        Pattern trainPattern = Pattern.compile(trainIDRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

        System.out.println("--- Train ID Validation ---");
        for (String id : testTrainIDs) {
            Matcher matcher = trainPattern.matcher(id);
            boolean isValid = matcher.matches();
            System.out.println("Input: " + id + " | Valid: " + isValid);
        }

        System.out.println("\n--- Cargo Code Validation ---");
        for (String code : testCargoCodes) {
            Matcher matcher = cargoPattern.matcher(code);
            boolean isValid = matcher.matches();
            System.out.println("Input: " + code + " | Valid: " + isValid);
        }
    }
}