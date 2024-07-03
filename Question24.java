//Rotation of elements of array- left and right 
package Problem_Set_3;

import java.util.Arrays;
import java.util.Scanner;

public class Question24 {
	public static int[] leftrotate(int[] arr,int k) {
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
	public static int[] rightrotate(int[] arr, int k) {
		int i=0,j=k;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		i=k+1;
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
		int[] arr2=new int[n];
		for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
				arr2[i]=arr[i];
	    }
		System.out.println("Enter the steps of rotation: ");
		int k=sc.nextInt();
		
		System.out.println("Left rotated array is: "+Arrays.toString(leftrotate(arr,k)));
		System.out.println("Right rotated array is: "+Arrays.toString(rightrotate(arr2,k)));


	}

}
