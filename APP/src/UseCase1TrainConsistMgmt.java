import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "GoodsBogie{Type='" + type + "', Cargo='" + cargo + "'}";
    }
}

public class UC12SafetyComplianceCheck {
    public static void main(String[] args) {
        List<GoodsBogie> goodsConsist = new ArrayList<>();

        goodsConsist.add(new GoodsBogie("Rectangular", "Coal"));
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsConsist.add(new GoodsBogie("Rectangular", "Grain"));
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));

        boolean isSafetyCompliant = goodsConsist.stream()
                .allMatch(bogie -> {
                    if (bogie.type.equals("Cylindrical")) {
                        return bogie.cargo.equals("Petroleum");
                    }
                    return true;
                });

        System.out.println("--- Train Safety Inspection Report ---");
        goodsConsist.forEach(System.out::println);

        System.out.println("\nValidation Status: " + (isSafetyCompliant ? "SAFE" : "UNSAFE"));

        if (isSafetyCompliant) {
            System.out.println("All safety protocols met. Train is cleared for departure.");
        } else {
            System.out.println("SAFETY ALERT: Invalid cargo detected in cylindrical bogie!");
        }
    }
}