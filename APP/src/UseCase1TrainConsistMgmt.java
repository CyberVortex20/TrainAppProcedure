class CargoSafetyException extends RuntimeException {
    CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String shape;
    String cargo;

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    void assignCargo(String cargo) {
        try {
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment: Petroleum cannot be placed in Rectangular bogie");
            }
            this.cargo = cargo;
            System.out.println("Cargo assigned: " + cargo + " to " + shape);
        } catch (CargoSafetyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Cargo assignment process completed for " + shape);
        }
    }

    String getCargo() {
        return cargo;
    }
}

public class UC15 {
    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");

        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");

        GoodsBogie b3 = new GoodsBogie("Rectangular");
        b3.assignCargo("Coal");
    }
}