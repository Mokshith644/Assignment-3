//Second Smallest element
package Problem_Set_3;

import java.util.Scanner;

public class Question4 {
	public static int secsmall(int[] arr) {
		int first=0;
		int second=-1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[first]) {
				second=first;
				first=i;
			}
			else if(arr[i]>arr[first]) {
				if(second==-1 || arr[second]>arr[i])second=i;
			}
		}
		return arr[second];
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
		System.out.println("Second smallest element in the array is: "+secsmall(arr));

	}

}
