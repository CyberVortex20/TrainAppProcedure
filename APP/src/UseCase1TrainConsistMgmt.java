public class UC16 {

    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] capacities = {72, 56, 24, 70, 60};

        bubbleSort(capacities);

        for (int i = 0; i < capacities.length; i++) {
            System.out.println(capacities[i]);
        }
    }
}