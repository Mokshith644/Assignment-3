//longest palindrome in an array
package Problem_Set_3;

import java.util.Scanner;

public class Question11 {
	public static int reverse(int n) {
		int res=0;
		while(n>0) {
			res=res*10+n%10;
			n/=10;
		}
		return res;
	}
	public static boolean isPal(int n) {
		int rev=reverse(n);
		if(n==rev)return true;
		return false;
	}
	public static int longestpalindrome(int[] arr) {
		if(arr.length==1)return arr[0];
		int res=-1;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>res && isPal(arr[i]))res=arr[i];
    }
		return res;
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
		System.out.println("The longest palindrome in the given array is: "+longestpalindrome(arr));
	}

}
