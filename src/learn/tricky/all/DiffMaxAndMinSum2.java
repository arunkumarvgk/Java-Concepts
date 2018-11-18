package learn.tricky.all;

import java.util.Arrays;
import java.util.Scanner;

public class DiffMaxAndMinSum2 {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);

		int min = 0;
		int max = 0;
		int n = 0;
		int l = 0;
		int i = 0;

		for (int k = 0; k < s.nextInt(); k++) {
			int N = s.nextInt();
			int M = s.nextInt();
			int arr[] = new int[N];
			for (i = 0; i < N; i++) {
				arr[i] = s.nextInt();
			}

			Arrays.sort(arr);

			min = 0;
			max = 0;

			n = arr.length - M;
			l = arr.length - n;
			for (i = 0; i < n; i++) {
				min += arr[i];
				max += arr[i + l];
			}

			System.out.println(max - min);
		}
	}
}
