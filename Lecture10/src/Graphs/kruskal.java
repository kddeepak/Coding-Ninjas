package Graphs;

import java.util.Arrays;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    int source;
    int destination;
    int weight;
    @Override
    public int compareTo(Edge o){
        return this.weight-o.weight;
    }
}
public class kruskal{
    public static void kruskals(Edge e[],int n){
        Arrays.sort(e);
        int[] parents=new int[n];//total possible parents is equal to the number of nodes present.
        for(int i=0;i<parents.length;i++){
            parents[i]=i;
        }
        int ans[][]=new int[n-1][2];//n-1 edges are required so as to build a minimum spanning tree of nodes n.
        
        int count=0;
        int i=0;
        while(count<n-1){
            
            int source1=e[i].source;
            int dest=e[i].destination;
            
            int sourceParent=findParent(source1,parents);
            int destParent=findParent(dest,parents);
            
            if(sourceParent!=destParent){
                ans[count][0]=source1;
                ans[count][1]=dest;
                count++;
                if(sourceParent<destParent){
                    parents[sourceParent]=destParent;
                }
                else
                    parents[destParent]=sourceParent;
                
            }
            if(i+1<e.length)
                i++;
        }
        printMST(ans);
        
    }

    private static int findParent(int source1, int[] parents) {
        if(parents[source1]==source1)
            return source1;

            return findParent(parents[source1],parents);
    }
    public static void printMST(int[][]ans){
        for (int i=0;i<ans.length;i++){
            for (int j=0;j<2;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int e=s.nextInt();
        Edge edges[]=new Edge[e];
        for(int i=0;i<e;i++){
            edges[i]=new Edge();
            edges[i].source=s.nextInt()-1;
            edges[i].destination=s.nextInt()-1;
            edges[i].weight=s.nextInt();
        }
        kruskals(edges,n);
    }
}
