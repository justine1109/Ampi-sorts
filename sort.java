import java.util.Arrays;

public class BubbleSortNameList {
    public static void main(String[] args) {
        // Array of names
        String[] names = {"Zara", "Anna", "John", "Mike", "Bella"};

        // Bubble Sort algorithm
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
                    // Swap names[j] and names[j + 1]
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        // Display sorted names using Arrays.toString()
        System.out.println("Sorted names: " + Arrays.toString(names));
    }
}
