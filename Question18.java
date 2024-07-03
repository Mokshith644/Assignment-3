//Finding all symmetric pairs in an array
package Problem_Set_3;

import java.util.Scanner;

public class Question18 {
	public static void symmetricpair(int[] arr) {
		System.out.println("The symmetric pairs in the array are: ");
		for(int i=0;i<arr.length/2;i++) {
			if(arr[i]==arr[arr.length-i-1])System.out.println("( "+arr[i]+" , "+arr[arr.length-i-1]+" )");
		}
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
		symmetricpair(arr);

	}

}
