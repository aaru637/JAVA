package com.dk.ds;

public class ExecutionFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 4, 1, 5, 6, 7 };
		Array.DELETEATBEGINUNSORTED(arr, arr.length - 1);
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
