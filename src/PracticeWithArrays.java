import java.util.Scanner;
import java.util.Random;

public class PracticeWithArrays {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        // 1. Create an array to hold the numbers 1-10.
        int index = 10;
        int[] nums1 = new int[index];
        int sumTotal = 0;
        Random rand = new Random();

        for (int i = 0; i < index; i++) {       // Entering numbers into the array (from 1 to 10)
            nums1[i] = rand.nextInt(10) + 1;
        }
        System.out.println();

        // 2. Loop through that array and sum the numbers 1-10, then print that total to the screen.
        for (int i = 0; i < index; i++) {
            sumTotal += nums1[i];
        }
        System.out.println("The total in array nums1 is: " + sumTotal);
        System.out.println();

        // 3. Create an array to hold 10 number inputs from the user and print that total to the screen.
        int[] nums2 = new int[index];
        sumTotal = 0;

        for (int i = 0; i < index; i++) {
            System.out.print("Enter a value between 1 and 10. ");
            nums2[i] = key.nextInt();
            sumTotal += nums2[i];
        }
        System.out.println("The total in array nums2 is: " + sumTotal);
        System.out.println();

        // 4. Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers.
        int[] nums3 = new int[index];
        double avg;
        double sumTotalD = 0;

        for (int i = 0; i < index; i++) {
            System.out.print("Enter a value for index " + (i+1) + ": ");
            nums3[i] = key.nextInt();
            sumTotalD += nums3[i];
        }
        avg = sumTotalD / (double) index;
        System.out.println("The average for the numbers in array nums3 is: " + avg);
        System.out.println();

        String garbage = key.nextLine();            // Cleaning up the buffer

        // 5. Create an array to store 3 names, loop through that array to print out the names.
        int nameIdx = 3;
        String[] names = new String[nameIdx];

        for (int i = 0; i < nameIdx; i++) {         // Loop for entering names
            System.out.print("Enter a name: ");
            names[i] = key.nextLine();
        }
        System.out.println();

        for (int i = 0; i < nameIdx; i++) {         // Loop for printing out the names
            System.out.println("The name in the array with index: " + i + " is: " + names[i]);
        }

        System.out.println();

        // 6. Create an array with the following values: [2,5,9,0,2,1,8,5,4] Loop through the array and
        //    print out the index each time the value equals 5.
        int[] nums6 = {2,5,9,0,2,1,8,5,4};
        for (int i = 0; i < nums6.length; i++) {
            System.out.println("The current value is: " + nums6[i]);
            if ( nums6[i] == 5) {
                System.out.println("the index for this number 5 is: " + i);
            }
        }

        System.out.println();

        // 7. Declare an array with the numbers 1-10. Print the numbers 1-10 backwards from the array.
        int[] nums7 = new int[index];
        for (int i = 0; i < index; i++) { nums7[i] = i; }       // Entering values into the array

        System.out.println("Printing the values from highest to lowest.");
        for (int i = (index - 1) ; i >= 0; i--) {
            System.out.println("Value: " + nums7[i]);
        }

        System.out.println();

        // 8. Given the following array: ['w','t','y','h','k']
        //    Loop through the array and replace the the letter 't' with the word "hello" once it's found.
        String[] ary8 = {"w","t","y","h","k"};
        for (int i = 0; i < ary8.length; i++) {
            if ( ary8[i].equals("t")) {
                ary8[i] = "hello";                  // Making the replacement
            }
        }
        for (String ary : ary8) {     // Testing the output
            System.out.println(ary);
        }

        System.out.println();

        // 9. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
        //    Write a program that will print out all matching pairs from arrays 1 and 2.
        //    Expected output:
        //    (7,7) and (6,6)
        int[] nums9_1 = {1,7,6,5,9};
        int[] nums9_2 = {2,7,6,3,4};

        for (int num1 : nums9_1) {
            for (int num2 : nums9_2) {
                if (num1 == num2) {
                    System.out.println("(" + num1 + "," + num2 + ")");
                }
            }
        }
    }
}
