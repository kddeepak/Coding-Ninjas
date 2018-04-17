import java.util.*;


public class PriorityQueueDemo {
   public static void main(String args[]) {
   // create priority queue
   
	   PriorityQueue<Integer> prq = new PriorityQueue<Integer>();
	
       
   // insert values in the queue
   for ( int i = 3; i  <  10; i++ ){  
   prq.add (new Integer (i)) ; 
   }
   prq.add(-1);
   prq.poll();
   System.out.println ( "Initial priority queue values are: "+ prq);
      
  
   // get the head from the queue
   Integer head = prq.peek();
      
   System.out.println ( "Head of the queue is: "+ head);
   }
}