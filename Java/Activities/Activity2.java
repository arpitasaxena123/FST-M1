package examples;

import java.util.*;

public class Activity2 {
	public static void main(String[] args) {
        int[] numArr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(numArr));

        int searchNum = 10;
        int fixedSum = 30;

        System.out.println("Result: " + result(numArr, searchNum, fixedSum));
    }

    public static boolean result(int[] numbers, int searchNum, int fixedSum) {

        int index = 0;
        int tempSum = 0;

        // iterate using while loop
        while (index < numbers.length && tempSum <= fixedSum) {

            if (numbers[index] == searchNum) {
                tempSum += searchNum;
            }

            // If the sum becomes greater than fixedSum, stop
            if (tempSum > fixedSum) {
                return false;
            }

            index++;
        }

        return tempSum == fixedSum;
    }
}