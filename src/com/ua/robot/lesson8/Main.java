package com.ua.robot.lesson8;

//import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Scanner ss = new Scanner(System.in);
        int length = 10;
        int maxNumber = 10;
        int[] arr = new int[length];
        fillArrayWithRandomNumbers(arr, maxNumber);
        printArray(arr);
        System.out.println("Min number of array is " + minArrayNumber(arr));
        System.out.println("Max number of array is " + maxArrayNumber(arr));
        System.out.println("Array numbers sum is " + sumArrayNumber(arr));
        System.out.println("Array numbers middle is " + middleArrayNumber(arr));
    }

    static void fillArrayWithRandomNumbers(int[] arr, int maxNumber) {
        Random temp = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = temp.nextInt(maxNumber);
        }
    }

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int minArrayNumber(int[] arr) {
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
            }
        }
        return temp;
    }

    static int maxArrayNumber(int[] arr) {
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        return temp;
    }

    static int sumArrayNumber(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            temp += arr[i];
        }
        return temp;
    }

    static int middleArrayNumber(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            temp += arr[i];
        }
        return temp/arr.length;
    }


}
