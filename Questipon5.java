//Sum of array elements
package Problem_Set_3;

import java.util.Scanner;

public class Questipon5 {
	public static int sumofarr(int[] arr) {
		int sum=0;
		for(int data: arr) {
			sum+=data;
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
		System.out.println("Sum of array elements is: "+sumofarr(arr));
	}

}
