package L23;

import java.util.ArrayList;

public class PriorityQueue {
	ArrayList<Integer> data;
	
	public PriorityQueue() {
		data = new ArrayList<Integer>();
		data.add(null);
	}
	
	public void insert(int element) {
		data.add(element);
		
		int childIndex = data.size() - 1;
		while(childIndex > 1) {//while it heapify till the root node...
			int parentIndex = childIndex / 2;
			if(data.get(parentIndex) < data.get(childIndex)) {
				return;
			}
			//otherwise just swap the data and put the min value at root ..
			int temp = data.get(childIndex);
			data.set(childIndex, data.get(parentIndex));
			data.set(parentIndex, temp);
			
			childIndex = parentIndex;//once that node is heapified check the parent and make it the child node... 
 		}
	}
	
	
	public int getMin() {
		if(data.size() == 1) {
			return Integer.MIN_VALUE;
		}
 		return data.get(1);
	}
	
	
	
	public int removeMin() {//removal of min value and heapify....//
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
			int temp = data.get(minIndex);
			data.set(minIndex, data.get(parentIndex));
			data.set(parentIndex, temp);
			parentIndex = minIndex;
		}
		return ans;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
