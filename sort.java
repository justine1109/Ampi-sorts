import java.util.Arrays;

public class BubbleSortNameList {
    public static void main(String[] args) {
        // Original array of names
        String[] names = {"Zara", "Anna", "John", "Mike", "Bella"};

        // --- Bubble Sort ---
        String[] bubbleSorted = names.clone();
        for (int i = 0; i < bubbleSorted.length - 1; i++) {
            for (int j = 0; j < bubbleSorted.length - i - 1; j++) {
                if (bubbleSorted[j].compareToIgnoreCase(bubbleSorted[j + 1]) > 0) {
                    // Swap
                    String temp = bubbleSorted[j];
                    bubbleSorted[j] = bubbleSorted[j + 1];
                    bubbleSorted[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted using Bubble Sort:    " + Arrays.toString(bubbleSorted));

        // --- Selection Sort ---
        String[] selectionSorted = names.clone();
        for (int i = 0; i < selectionSorted.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < selectionSorted.length; j++) {
                if (selectionSorted[j].compareToIgnoreCase(selectionSorted[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap
            String temp = selectionSorted[minIndex];
            selectionSorted[minIndex] = selectionSorted[i];
            selectionSorted[i] = temp;
        }
        System.out.println("Sorted using Selection Sort: " + Arrays.toString(selectionSorted));

        // --- Insertion Sort ---
        String[] insertionSorted = names.clone();
        for (int i = 1; i < insertionSorted.length; i++) {
            String key = insertionSorted[i];
            int j = i - 1;

            // Move elements of insertionSorted[0..i-1] that are greater than key
            while (j >= 0 && insertionSorted[j].compareToIgnoreCase(key) > 0) {
                insertionSorted[j + 1] = insertionSorted[j];
                j = j - 1;
            }
            insertionSorted[j + 1] = key;
        }
        System.out.println("Sorted using Insertion Sort: " + Arrays.toString(insertionSorted));
    }
}
