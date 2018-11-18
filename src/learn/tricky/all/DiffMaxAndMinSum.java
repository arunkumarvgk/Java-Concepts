package learn.tricky.all;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class DiffMaxAndMinSum {

	public static void sortArray(int arr[]) {
		boolean isSorted = false;
		int lastUnsorted = arr.length - 1;

		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < lastUnsorted; i++) {
				if (arr[i] > arr[i + 1]) {
					arr[i] = arr[i] + arr[i + 1];
					arr[i + 1] = arr[i] - arr[i + 1];
					arr[i] = arr[i] - arr[i + 1];
					isSorted = false;
				}
			}
			lastUnsorted--;
		}
	}

	public static int minAndMaxDiff(int sortedArr[], int n) {
		int min = 0;
		int max = 0;

		for (int i = 0; i < n; i++) {
			min += sortedArr[i];
			max += sortedArr[i+((sortedArr.length - n))];
		}
		return max - min;
	}

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);

		int noOfTests = 0;
		noOfTests = s.nextInt();

		for (int k = 0; k < noOfTests; k++) {
			int N = s.nextInt();
			int M = s.nextInt();
			List<Integer> list= new ArrayList<>();
			int arr[] = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = s.nextInt();
			}
			//sortArray(arr);
			Arrays.sort(arr);
			System.out.println(minAndMaxDiff(arr, arr.length - M));
		}
		
		/*Scanner s = new Scanner(System.in);

		int noOfTests = 0;
		noOfTests = s.nextInt();

		for (int k = 0; k < noOfTests; k++) {
			int N = s.nextInt();
			int M = s.nextInt();
			List<Integer> list= new ArrayList<>();
			for (int i = 0; i < N; i++) {
				list.add(s.nextInt());
			}
			Collection.sort();
			System.out.println(minAndMaxDiff(list, list.size() - M));
		}*/

	}
}
