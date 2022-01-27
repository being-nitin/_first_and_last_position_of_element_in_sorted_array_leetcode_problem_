package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
    If target is not found in the array, return [-1, -1].
    You must write an algorithm with O(log n) runtime complexity.

    Example 1:

    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]
    Example 2:

    Input: nums = [5,7,7,8,8,10], target = 6
    Output: [-1,-1]
    Example 3:

    Input: nums = [], target = 0
    Output: [-1,-1]
	 */
     int[] arr = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(binarySearch(arr,7 )));

    }
    public static int[] binarySearch(int[] arr,int target){
        int[] result = new int[2];
        result[0] = binaryASearch1(arr,target);
        result[1] = binarySearch2(arr,target);
        return result;
    }
    public static int binaryASearch1(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int result=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                result = mid;
                // found but search in the left part too for the first occurance.
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
        }
        return result;
    }
    public static int binarySearch2(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if(target==arr[mid]){
                result = mid;
                // found burt search in the right part too for the last occurance.
                start = mid+1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
        }
        return result;
    }
}









