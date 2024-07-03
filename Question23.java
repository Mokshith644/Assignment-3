package Problem_Set_3;

import java.util.Scanner;

public class Question23 {
	public static int sumOfMinAbsDifferences(int[] arr) {
		int sum = 0;
		int n=arr.length;
		for (int i = 0; i < n; i++) {
			int diff = Integer.MAX_VALUE;
			for (int j = 0; j < n; j++) {
				if (i != j) {
					diff = Math.min(diff, Math.abs(arr[i] - arr[j]));
				}
			}
			sum += diff;

		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int n=sc.nextInt();
		System.out.println("Enter array elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
	    }
		System.out.println("Sum of minimum absolute difference in the array is: "+sumOfMinAbsDifferences(arr));

	}

}
