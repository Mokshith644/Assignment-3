//Removing duplicate elements from an array
package Problem_Set_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question15 {
	public static ArrayList<Integer> removeduplicates(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int data : arr) {
            mp.put(data, mp.getOrDefault(data, 0) + 1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> ele : mp.entrySet()) {
            res.add(ele.getKey());
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
		System.out.println("Array after removing duplicate values: "+removeduplicates(arr));

	}

}
