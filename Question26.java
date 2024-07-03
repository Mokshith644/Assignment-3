//Balanced Parenthesis Problem
package Problem_Set_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Question26 {
	public static boolean balanced(String s) {
		ArrayList<Character> arr=new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(arr.size()==0 && (c=='}' || c==')' || c==']'))return false;
			if(c=='('||c=='{'||c=='[')arr.addLast(c);
			else if(c==')'||c=='}'||c==']') {
				char last=arr.getLast();
				if((last=='(' && c==')') ||(last=='{' && c=='}') || (last=='[' && c==']'))arr.removeLast();
			}
		}
		if(arr.size()==0)return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter the paranthesis :");
		s=sc.next();
		if(balanced(s))System.out.println("Parenthesis is balanced");
		else System.out.println("Imbalanced paranthesis");

	}

}
