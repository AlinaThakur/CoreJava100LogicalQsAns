package ControlStatement;

public class firstFirstUnique {
    public static void main(String[] args) {

        int[] arr = {101, 101, 103, 103, 405, 705};

        // Loop through each element
        for (int i = 0; i < arr.length; i++) {

            boolean isUnique = true; // assume current element is unique

            // Compare with all elements
            for (int j = 0; j < arr.length; j++) {

                // i != j → avoid comparing element with itself (same index)
                // arr[i] == arr[j] → check if duplicate exists
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false; // duplicate found
                    break; // stop checking further
                }
            }

            // If no duplicate found, it's the first unique element
            if (isUnique) {
                System.out.println("First unique number: " + arr[i]);
                break; // stop after finding first unique
            }
        }
    }
}