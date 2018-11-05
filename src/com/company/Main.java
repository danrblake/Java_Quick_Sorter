package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] entryArray = {4,32,29,10,5,16};
        QuickSorter quickSorter = new QuickSorter();
        System.out.println(Arrays.toString(quickSorter.sortArray(entryArray)));
    }
}
