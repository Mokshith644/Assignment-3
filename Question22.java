package Problem_Set_3;

import java.util.Scanner;

public class Question22 {
	public static boolean Equalize(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			while(arr[i]%2==0)arr[i]/=2;
			while(arr[i]%3==0)arr[i]/=3;
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1])return false;
		}
		return true;
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
		if(Equalize(arr))System.out.println("All the elements can be made equal");
		else System.out.println("Elements cant be made equal");
		

	}

}
