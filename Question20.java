//Check if array is disjoint
package Problem_Set_3;

import java.util.HashSet;
import java.util.Scanner;

public class Question20 {
	public static boolean check(int[] arr1, int[] arr2) {
		HashSet<Integer>s=new HashSet<Integer>();
		for(int data:arr1) {
			s.add(data);
		}
		for(int data:arr2) {
			if(s.contains(data))return false;
		}
		return true;
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int n=sc.nextInt();
		System.out.println("Enter array 1 elements: ");
		int[] arr1=new int[n];
		for(int i=0;i<n;i++){
				arr1[i]=sc.nextInt();
	    }
		System.out.println("Enter array 2 elements: ");
		int[] arr2=new int[n];
		for(int i=0;i<n;i++){
			arr2[i]=sc.nextInt();
    }
		if(check(arr1,arr2))System.out.println("Disjoint sets");
		else System.out.println("Not disjoint sets");
		

	}

}
