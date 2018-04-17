import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int traderProfit(int k, int n, int[] A) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(A[i]<A[j])
                    al.add(A[j]-A[i]);
            }
        }
        Collections.sort(al);
        int sum =0;
        int count =0;
        System.out.println(al);
       /* for(int i=al.size();i>=0;i--)
        {
         sum+=al.get(i);
         count+=1;
         if(count==k)
             break;
        }*/
        return sum;
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int k = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int result = traderProfit(k, n, arr);
            System.out.println(result);
        }
        in.close();
    }
}
