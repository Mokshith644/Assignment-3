//Determine array is a subset of another array or not
package Problem_Set_3;

import java.util.HashSet;
import java.util.Scanner;

public class Question21 {
	public static boolean subset(int[] arr1, int[] arr2) {
		HashSet<Integer> s=new HashSet<Integer>();
		for(int data: arr1) {
			s.add(data);
		}
		for(int data: arr2) {
			if(!s.contains(data))return false;
		}
		return true;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the first array: ");
		int n1=sc.nextInt();
		System.out.println("Enter array 1 elements: ");
		int[] arr1=new int[n1];
		for(int i=0;i<n1;i++){
				arr1[i]=sc.nextInt();
	    }
		System.out.println("Enter the number of elements in the second array: ");
		int n2=sc.nextInt();
		System.out.println("Enter array 2 elements: ");
		int[] arr2=new int[n2];
		for(int i=0;i<n2;i++){
			arr2[i]=sc.nextInt();
    }
		if(subset(arr1,arr2))System.out.println("Array 2 is a subset of array 1");
		else System.out.println("Array 2 is not a subset of array 1");

	}

}
