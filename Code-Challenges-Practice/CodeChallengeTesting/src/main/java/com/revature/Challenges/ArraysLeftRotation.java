package com.revature.Challenges;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Antonio Marrero Bonilla
 * 
 * This challenge is to get an array of numbers and shift the numbers by certain
 * amount of turns to the left given n = turns.
 * 
 */

public class ArraysLeftRotation {
	
	// Driver program
    public static void main (String[] args) 
    {
            int arr[] = { 1, 3, 5, 7, 9 };
            
            System.out.print("The original array to be shifted to the left is: "+ Arrays.toString(arr) + "\n"); //Prints content of the original array.
            
            int n = arr.length; // length of the array.
            
            System.out.print("The arrays length is : " + arr.length + "\n");
 
            int k = 2; // 2 rotations to the left            
            leftRotate(arr, n, k);
 
            k = 3; // 3 rotations to the left            
            leftRotate(arr, n, k);
 
            k = 4; // 4 rotations to the left            
            leftRotate(arr, n, k); 
    }
	
	// Function to leftRotate array multiple
    // times
    public static void leftRotate(int arr[], int n,
                                     int k)
    {
        /* To get the starting point of 
        rotated array */
        int mod = k % n;
     
        // Prints the rotated array from 
        // start position
        for(int i = 0; i < n; ++i)
        System.out.print(arr[(i + mod) % n]
                          + " ");          
        System.out.println();
    }
}

