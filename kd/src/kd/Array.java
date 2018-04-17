package kd;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int[] arr = new int[5];

		for(int i=0;i<5;i++){

			arr[i]=s.nextInt();
		}

		for(int i=0;i<5;i++){

			System.out.print(arr[i]+" ");
		}


	}

}
