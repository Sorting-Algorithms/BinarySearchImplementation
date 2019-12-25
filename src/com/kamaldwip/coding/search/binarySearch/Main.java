package com.kamaldwip.coding.search.binarySearch;

public class Main {

    public static void main(String[] args) {

        int[] inputArr = {-22, -15, 1, 7, 20, 35, 55};

        System.out.println(iterativeBinarySearch(inputArr,1));
        System.out.println(iterativeBinarySearch(inputArr,35));
        System.out.println(iterativeBinarySearch(inputArr,88));
        System.out.println(iterativeBinarySearch(inputArr,20));

        System.out.println(recursiveBinarySearch(inputArr,1));
        System.out.println(recursiveBinarySearch(inputArr,35));
        System.out.println(recursiveBinarySearch(inputArr,88));
        System.out.println(recursiveBinarySearch(inputArr,20));


    }

    public static int iterativeBinarySearch(int[] input,int value){
        int start = 0;
        int end = input.length;
        while(start < end){
            int midpoint = (start + end)/2;
            System.out.println("Midpoint = "+midpoint);
            if(input[midpoint] == value){
                return midpoint;
            }
            else if(input[midpoint] < value){
                start = midpoint + 1;
            }
            else {
                end = midpoint;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int value){
        return recursiveBinarySearchHelper(input,0,input.length,value);
    }

    private static int recursiveBinarySearchHelper(int[] input, int start, int end, int value) {
        if(start >= end){
            return -1;
        }
        int midpoint = (start + end)/2;
        System.out.println("Midpoint = "+midpoint);
        if(input[midpoint] == value){
            return midpoint;
        }
        else if(input[midpoint] < value){
            return recursiveBinarySearchHelper(input,midpoint+1,end,value);
        }
        else {
            return recursiveBinarySearchHelper(input,start,midpoint,value);
        }
    }


}
