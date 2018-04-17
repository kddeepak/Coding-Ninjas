import java.util.Scanner;

public class Test {
	public static void printStarray(String[] input){
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]);
		}
	}
	
	public static char[] findchars(int rem){
		if(rem==2){
			char ans[]={'a','b','c'};
			return ans;
		}
		if(rem==3){
			char ans[]={'d','e','f'};
			return ans;
		}
		if(rem==4){
			char ans[]={'g','h','i'};
			return ans;
		}
		if(rem==5){
			char ans[]={'j','k','l'};
			return ans;
		}
		if(rem==6){
			char ans[]={'m','n','o'};
			return ans;
		}
		if(rem==7){
			char ans[]={'p','q','r','s'};
			return ans;
		}
		if(rem==8){
			char ans[]={'t','u','v'};
			return ans;
		}
		if(rem==9){
			char ans[]={'w','x','y','z'};
			return ans;
		}
		char ans[]={'*'};
		return ans;
	}
	
	public static String[] keypad(int n){
		if(n/10==0)
		{
			char zero[]=findchars(n);
			String ans[]=new String[zero.length];
			for(int i=0;i<zero.length;i++){
				ans[i]=zero[i]+"";
			}
			return ans;
		}
		
		String temp[]=keypad(n/10);
		
		int rem=n%10;
		char crs[] = findchars(rem);
		
		String ans[]=new String[crs.length*temp.length];
		int count=0;
		for(int i=0;i<temp.length;i++){
			for(int j=0;j<crs.length;j++){
				ans[count]=temp[i]+crs[j];
				count++;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		printStarray(keypad(n));
	}

}
