
package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // array to hold numbers 1-10
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int sum = 0;
//        for (int i = 0; i < 10; i++) {
//            sum = sum + numbers[i];
//
//            // write your code here
//        }
//        System.out.println("The sum of 1-10 is : " + sum);


        // get the sum of 1-10

// below : Create an array to hold 10 number inputs from the user and print that total to the screen.

//        Scanner input = new Scanner(System.in);
//        int[] numbers2 = new int[10];
//        int sum1 = 0;
//        for (int j = 0; j < numbers2.length; j++) {
//            System.out.println("Another Excericse");
//            System.out.println("Enter a number :");
//            // enter 10 numbers
//            numbers2[j] = input.nextInt();
//            sum1 = sum1 + numbers2[j];
//        }


//        System.out.println("The sum is " + sum1);

//        // Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers.
//        Scanner input2 = new Scanner(System.in);
//        int[] numbers3 = new int[10];
//        int sum2 = 0;
//        double avg = 0;
//        System.out.println("Another Excericse");
//        for (int k = 0; k < numbers3.length; k++) {
//
//            System.out.println("Enter a number :");
//            // enter 10 numbers
//            numbers3[k] = input2.nextInt();
//            sum2 = sum2 + numbers3[k];
//            avg = sum2 / numbers3.length;
//        }
//        System.out.println("The avg is " + avg);

        //Create an array to store 3 names, loop through that array to print out the names.
// new string array

//        Scanner input3 = new Scanner(System.in);
//        String[] name = new String[3];
//            for (int l = 0; l < name.length; l++) {
//                System.out.println("Please enter a name :");
//                name[l] = input3.nextLine();
//
//            }
//            // Print values
//        for (String word : name) {
//            System.out.println("The names are " + word);
//        }
//        // print using java utils array
//        System.out.println("Using the java utils array library, here are the  names that you entered : ");
//        System.out.println(Arrays.toString(name));

        // end

        // #6 Create an array with the following values: [2,5,9,0,2,1,8,5,4] Loop through the array and print out the index each time the value equals 5.
//     int [] numbers6 = {2,5,9,0,2,1,8,5,4};
//
//        for (int m = 0; m < numbers6.length; m++) {
//            if (numbers6[m] == 5 ){
//                System.out.println("At Index Position "+ m + " value is equal to 5");
//            }
//        }
// #7 Declare an array with the numbers 1-10. Print the numbers 1-10 backwards from the array.
int [] num10 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("#7");
        for (int n =9; n>-1; n--){
            System.out.println(" In reverse " +num10[n]);
        }

//
//        #8 Given the following array: ['w','t','y','h','k']
//        Loop through the array and replace the the letter 't' with the word "hello" once it's found.

        char [] origchar = {'w','t','y','h','k'};
        String nowstring = new String(origchar);

        //System.out.println(nowstring);

        String [] newstr = new String[10];
        newstr[0] = nowstring;

        //System.out.println(nowstring);
        System.out.println("#8");

        //String nowstring = new String()
        for (int o=0; o <1; o++);
            if (newstr[0]="t"){
                newstr[0]="hello";
            }



//9. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
//Write a program that will print out all matching pairs from arrays 1 and 2.
//Expected output:
//(7,7) and (6,6)

        int arr1[] = {1, 7, 6, 5, 9};
        int arr2[] = {2, 7, 6, 3, 4};
        System.out.println("#9");
        for (int p = 0; p < arr1.length; p++) {
            for (int q = 0; q < arr2.length; q++) {
                if (arr1[p] == arr2[q]) {
                    System.out.println(arr1[p] + " is a matching pair");
                }
                // }

            }
        }
    }
}