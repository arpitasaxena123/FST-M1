package examples;

import java.util.Arrays;

class Activity4 {

    public static void main(String[] args) {

        int[] data = { 9, 5, 1, 4, 3 };

        // Different approach — use built-in sorting
        Arrays.sort(data);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}