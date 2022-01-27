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
        System.out.println(Arrays.toString(search(arr,6 )));
    }
    public static int[] search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                return new int[]{mid-1,mid};
            }
        }
        return new int[]{-1,-1};
    }
}









