//Minimum and maximum element in the array
package Problem_Set_3;

import java.util.Scanner;

public class Question3 {

	public static int largest(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)max=arr[i];
		}
		return max;
	}
	public static int minele(int[] arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min)min=arr[i];
		}
		return min;
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
		System.out.println("Largest element in the array is: "+largest(arr));
		System.out.println("Smallest element in the array is: "+minele(arr));

}
}
