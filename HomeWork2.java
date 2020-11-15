package com.company.HW2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class HomeWork2 {
    public static void main(String[] args) {

        System.out.println("Task 1. Create next array of Integers with values: 2,3,1,7,11. Sort them by DESC(reverseOrder)");
        System.out.println("Task 2. You get an array of numbers(should contain both positive and negative numbers), and return the sum of all the positive ones. (If there are nothing to sum, sum should be 0)");
        System.out.println("Task 3. You get an array of numbers, return the average of a list of numbers in this array. (Example -  array{1,2,4,1} -> avg = 2)");
        System.out.println("Task 4. You have array {3,2,3,1,4,2,8,3}. Replace all duplicated values by 0. Result should be  next: {3,2,0,1,4,0,8,0}");

        Scanner firstInput = new Scanner(System.in);
        System.out.println("Please, input number of task");
        int numberOfTask = firstInput.nextInt();

        switch (numberOfTask){

            case 1:
                Integer [] firstGivenArray = {2,3,1,7,11};
                System.out.println("Current array:");
                for (int val : firstGivenArray){
                    System.out.print(val + "  ");
                }
                System.out.println(" ");
                Arrays.sort(firstGivenArray, Collections.reverseOrder());
                System.out.println("Sorted array");
                for (int i = 0; i < firstGivenArray.length; i++) {
                    System.out.print(firstGivenArray[i] + "  ");
                }
                break;

            case 2:
                Scanner secondInput = new Scanner(System.in);
                System.out.println("Please, input quantity of elements in your array");
                int numberOfElementsInArray = secondInput.nextInt();
                int [] arrayForSecondTask = new int[numberOfElementsInArray];
                for (int i = 0; i < arrayForSecondTask.length; i++) {
                    System.out.println("Please, input " + (i+1) + " element of your array");
                    arrayForSecondTask[i] = secondInput.nextInt();
                }

                int sumOfPositiveNumbers = 0;
                System.out.println("Your array:");
                for (int val: arrayForSecondTask) {
                    System.out.print(val + "  ");
                    if (val > 0){
                        sumOfPositiveNumbers+=val;
                    }
                }
                System.out.println(" ");
                if (sumOfPositiveNumbers == 0){
                    System.out.println("There is no positive numbers in your array");
                }
                else{
                    System.out.println("Sum of all the positive numbers in your array is "+ sumOfPositiveNumbers);
                }
                System.out.println(" ");
                break;

            case 3:
                Scanner thirdInput = new Scanner(System.in);
                System.out.println("Please, input quantity of elements in your array");
                int numberOfElementsInThirdArray = thirdInput.nextInt();
                int [] arrayForThirdTask = new int[numberOfElementsInThirdArray];
                for (int i = 0; i < arrayForThirdTask.length; i++) {
                    System.out.println("Please, input " + (i+1) + " element of your array");
                    arrayForThirdTask[i] = thirdInput.nextInt();
                }

                int sumOfElementsInArray = 0;
                for (int val: arrayForThirdTask) {
                    sumOfElementsInArray+=val;
                }
                int averageOfNumbers = sumOfElementsInArray / arrayForThirdTask.length;
                System.out.println("Average of a list of numbers in your array is " + averageOfNumbers);
                break;

            case 4:
                int [] secondGivenArray = {3,2,3,1,4,2,8,3};
                int [] reworkedArray = {3,2,3,1,4,2,8,3};
                System.out.println("Given array is:");
                for (int val:secondGivenArray) {
                    System.out.print(val + "  ");
                }
                for (int i = 1; i < secondGivenArray.length; i++) {
                    for (int j = 0; j < i; j++) {
                        if (secondGivenArray[i] == secondGivenArray[j]){
                            reworkedArray[i] = 0;
                        }
                    }
                }
                System.out.println(" ");
                System.out.println("Reworked array is:");
                for (int val:reworkedArray) {
                    System.out.print( val + "  ");
                }
                break;

            default:
                System.out.println("You inputed wrong number");
        }
    }
}
