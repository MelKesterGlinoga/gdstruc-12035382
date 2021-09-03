package com.melkester;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 6;
        numbers[1] = 2;
        numbers[2] = 16;
        numbers[3] = 12;
        numbers[4] = -2;
        numbers[5] = 14;
        numbers[6] = 10;
        numbers[7] = 8;
        numbers[8] = 4;
        numbers[9] = 0;

        System.out.println("Bubble sort");
        System.out.print("Unsorted array: ");
        printArrayElements(numbers);

        bubbleSortAscending(numbers);
        System.out.print("\nAscending array: ");
        printArrayElements(numbers);

        bubbleSortDescending(numbers);
        System.out.print("\nDescending array: ");
        printArrayElements(numbers);

        System.out.println("\n\nSelection sort");
        System.out.print("Unsorted array: ");
        printArrayElements(numbers);

        selectionSortAscending(numbers);
        System.out.print("\nAscending array: ");
        printArrayElements(numbers);

        selectionSortDescending(numbers);
        System.out.print("\nDescending array: ");
        printArrayElements(numbers);

        System.out.println("\n\nSelection sort (but it looks for the smallest value first");
        System.out.print("Unsorted array: ");
        printArrayElements(numbers);

        selectionSortSmallest(numbers);
        System.out.print("\nSorted array: ");
        printArrayElements(numbers);
    }

    private static void bubbleSortAscending(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] > arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void bubbleSortDescending(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSortAscending(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex = 0;

            for (int i = 0; i <= lastSortedIndex; i++)
            {
                if (arr[i] > arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }

    private static void selectionSortDescending(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex = 0;

            for (int i = 0; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }

    private static void selectionSortSmallest(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;

            for (int i = 0; i <= lastSortedIndex; i++)
            {
                if (arr[i] > arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
