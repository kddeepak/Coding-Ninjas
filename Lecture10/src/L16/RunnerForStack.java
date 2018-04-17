package L16;

import java.util.Scanner;

public class RunnerForStack {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		StackUsingLL<Integer> a = new StackUsingLL<Integer>();
		a.push(10);a.push(20);a.push(30);a.push(40);a.pop();
		//String input=s.nextLine();
		System.out.println(a.getSize());
		System.out.println(a.isEmpty());
		System.out.println(a.pop());
		System.out.println(a.top());
		
		/*for(int i=0;i<input.length();i++)
		{
			
		}*/
	}

}
