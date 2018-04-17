/*
 HeapSort by kddeepaksingh@gmail.com
 
 Date :-18/09/2017
 */
import java.util.*;


public class heapsort {
    
    //max-heapify the heap...
    public static void heapify(int a[],int i,int l){
        
        int left=2*i;
        int right=2*i+1;
        int max =i;
        if(left< l && a[left]>a[i]){
            max=left;
        }
        if( right< l && a[max]<a[right]){
            max=right;
        }
        int temp = a[i];
        a[i]=a[max];
        a[max]=temp;
        
        if(max!=i){
            heapify(a,max,l);
        }
        
        
    }
    
    public static void max_heapify(int a[],int l){
        
        for(int i=(l-1)/2;i>=0;i--){
            heapify(a,i,l);
        }
    }
    
    
    static int[] fin = new int[10000];
    static int k =0;
    public static void extractmin(int a[],int l){
        
        fin[k]=a[0];
        a[0]=a[l-1];
        k++;
        heapify(a,0,l);
        
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=(int) (Math.random()*101);
            System.out.print(a[i]+" ");
            
        }
        System.out.println("\n");
        int l = a.length;
        
        max_heapify(a,l);
       
        while(l!=0){
            extractmin(a, l);
            l--;
        }
        
        
        for(int i=n-1;i>=0;i--){
            System.out.print(fin[i]+" ");
        }
        
    }

}