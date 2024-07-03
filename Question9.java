package Problem_Set_3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Question9 {
	public static Map<Integer,Integer> freq(int[] arr){
		Map<Integer,Integer> mp=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i])+1);
			}
			else mp.put(arr[i], 1);
		}
		return mp;
		
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
		System.out.println("Frequency of elements in array is: "+freq(arr));


	}

}
