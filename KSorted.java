//---heap sort--->>>>
import java.util.ArrayList;
import java.util.Scanner;

public class KSorted {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int k = s.nextInt();
			int n = s.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=s.nextInt();
			}
			PriorityQueue p = new PriorityQueue();
			int j=0;
			while(j<k)
			{
				p.insert(a[j]);
				j++;
			}
			ArrayList<Integer> b = new ArrayList<Integer>();
			b.add(p.removeMin());
			while(j<n)
			{
				p.insert(a[j]);
				b.add(p.removeMin());
				j++;
			}
			int z=0;
			while(z<k-1)//remove the left elements in the priority queue...
			{
				b.add(p.removeMin());
				z++;
			}
			System.out.println(b);
			
			
			
		}
}