//Counting the number of odd and even elements
package Problem_Set_3;

import java.util.Scanner;

public class Question17 {
	public static void countoddeven(int[] arr) {
		int even=0,odd=0;
		for(int data:arr) {
			if(data%2==0)even++;
			else odd++;
		}
		System.out.println("Number of even elements in the array is: "+even);
		System.out.println("Number of odd elements in the array is: "+odd);
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
		countoddeven(arr);

	}

}
