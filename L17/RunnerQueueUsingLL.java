package L17;



public class RunnerQueueUsingLL {
	
	public static void main(String[] args) {
		
		QueueUsingLL1<Integer> a = new QueueUsingLL1<Integer>();
		a.enqueue(10);a.enqueue(20);a.enqueue(30);a.enqueue(40);a.enqueue(50);
		/*a.dequeue();
		System.out.println(a.isEmpty());
		System.out.println(a.getSize());*/
		while(!(a.isEmpty())){
			System.out.println(" "+a.getSize()+" "+a.dequeue());
		}
		
		
	}

}
