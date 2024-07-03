//Finding minimum scalar product of 2 arrays
package Problem_Set_3;

import java.util.Arrays;
import java.util.Scanner;

public class Question16 {
	public static int minScalarProduct(int[] arr1, int[] arr2)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int res=0;
		for(int i=0;i<arr1.length;i++) {
			res+=arr1[i]*arr2[arr2.length-i-1];
		}
		return res;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int n=sc.nextInt();
		System.out.println("Enter array 1 elements: ");
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		for(int i=0;i<n;i++){
				arr1[i]=sc.nextInt();
	    }
		System.out.println("Enter array 1 elements: ");
		for(int i=0;i<n;i++){
			arr2[i]=sc.nextInt();
    }
		System.out.println("Minimum Scalar product of the given arrays is: "+minScalarProduct(arr1,arr2));

	}

}
