package learn.tricky.all;

public class FindDuplicate {
	void printRepeating(int arr[], int size) {
		int i;
		System.out.println("The repeating elements are : ");

		for (i = 0; i < size; i++) {
			//System.out.println(" "+arr[i]+"->"+arr[Math.abs(arr[i])]);
			if (arr[Math.abs(arr[i])] >= 0){
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
				for(int j=0;j<size;j++){
					System.out.print(" "+arr[j]);
				}
				System.out.println("\n");
			}else{
				System.out.println(Math.abs(arr[i]) + " ");
			}
		}
	}

	/* Driver program to test the above function */
	public static void main(String[] args) {
		FindDuplicate duplicate = new FindDuplicate();
		int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		int arr_size = arr.length;
		duplicate.printRepeating(arr, arr_size);
	}
}