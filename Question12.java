package Problem_Set_3;

import java.util.HashSet;
import java.util.Scanner;

public class Question12 {
	public static int countdistinct(int[] arr) {
		HashSet<Integer> s=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			s.add(arr[i]);
		}
		return s.size();
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
		System.out.println("Number of distinct elements in the array is: "+countdistinct(arr));

	}

}
