class InvalidCapacityException extends Exception {
    InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    String type;
    int capacity;

    PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    String getType() {
        return type;
    }

    int getCapacity() {
        return capacity;
    }
}

public class UC14 {
    public static void main(String[] args) {

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 40);
            System.out.println(b1.getType() + " " + b1.getCapacity());
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }

        try {
            PassengerBogie b2 = new PassengerBogie("AC Chair", -5);
            System.out.println(b2.getType() + " " + b2.getCapacity());
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }

        try {
            PassengerBogie b3 = new PassengerBogie("First Class", 0);
            System.out.println(b3.getType() + " " + b3.getCapacity());
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}