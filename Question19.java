//Maximum product subarray in a given array
package Problem_Set_3;

import java.util.Arrays;
import java.util.Scanner;

public class Question19 {
	static int[] maxSubarrayProduct(int arr[])
    {
        int result = arr[0];
        int n = arr.length;
        
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < n; i++) {
            int mul = arr[i];
            if (mul > result) {
                result = mul;
                start = i;
                end = i;
            }
            
            for (int j = i + 1; j < n; j++) {
                mul *= arr[j];
                if (mul > result) {
                    result = mul;
                    start = i;
                    end = j;
                }
            }
        }
        return new int[]{start,end};
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
		System.out.println("The index of the subarray with the maximum product is: "+  Arrays.toString(maxSubarrayProduct(arr)));

	}

}
