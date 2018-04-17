package L15;

public class GenericFunctions {

	
	// What if input array class doesn't have the funciton
	// isGreater ??
	// Ans - Interface
	// T - tempporary data type - We are treating it a class
	public static <T extends CompareInterface<T>> void bubbleSort(T input[]) {
		for(int i = 0; i < input.length; i++) {
			for(int j = 0; j < input.length - i - 1; j++) {
				// Assuming every class that wants to sort its 
				// array have the function "isGreater" which 
				// return true if input[j] > input[j+1] 
				// (according to its properties), else returns false
				if(input[j].isGreater(input[j+1])) {
					T temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
	}
	
	
	
	
	
	/*public static void bubbleSortStudent(Student input[]) {
		for(int i = 0; i < input.length; i++) {
			for(int j = 0; j < input.length - i - 1; j++) {
				if(input[j].marks > input[j+1].marks) {
					Student temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
	}*/
	
	
	
	
	
	
	
	
	
}
