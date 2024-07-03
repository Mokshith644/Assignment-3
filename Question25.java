//Circular rotation of an array by k positions
package Problem_Set_3;

import java.util.Arrays;
import java.util.Scanner;

public class Question25 {
	public static int[] cyclicrotate(int[] arr, int k) {
		int i=0,j=k-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		i=k;
		j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		i=0;
		j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
		
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
		int k;
		System.out.println("Enter the steps of rotation: ");
		k=sc.nextInt();
		System.out.println("Cyclically rotated array is: "+Arrays.toString(cyclicrotate(arr,k)));

	}

}
