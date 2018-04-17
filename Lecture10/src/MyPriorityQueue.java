
import java.util.ArrayList;

public class MyPriorityQueue {
	ArrayList<Integer> data;
	
	public MyPriorityQueue() {
		data = new ArrayList<Integer>();
		data.add(null);
	}
	
	public void insert(int element) {
		data.add(element);
		
		int childIndex = data.size() - 1;
		while(childIndex > 1) {
			int parentIndex = childIndex / 2;
			if(data.get(parentIndex) < data.get(childIndex)) {
				return;
			}
			int temp = data.get(childIndex);
			data.set(childIndex, data.get(parentIndex));
			data.set(parentIndex, temp);
			
			childIndex = parentIndex;
 		}
	}
	
	public int getMin() {
		if(data.size() == 1) {
			return Integer.MIN_VALUE;
		}
 		return data.get(1);
	}
	
	public int removeMin() {
		if(data.size() == 1) {
			return Integer.MIN_VALUE;
		}
		int ans = data.get(1);
		data.set(1, data.get(data.size() - 1));
		data.remove(data.size() - 1);
		
		int parentIndex = 1;
		while(true) {
			int leftIndex = parentIndex * 2;
			int rightIndex = leftIndex + 1;
					
			int minIndex = parentIndex;
			if(leftIndex < data.size() && data.get(leftIndex) < data.get(minIndex)) {
				minIndex = leftIndex;
			}
			if(rightIndex < data.size() && data.get(rightIndex) < data.get(minIndex)) {
				minIndex = rightIndex;
			}
			if(minIndex == parentIndex) {
				break;
			}
			//swapping..
			int temp = data.get(minIndex);
			data.set(minIndex, data.get(parentIndex));
			data.set(parentIndex, temp);
			parentIndex = minIndex;
		}
		return ans;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
 