package divideAndConquer;

public class QuickSort {
	public static int partition(int A[], int p, int r) {
		int pivot = A[r];
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (A[j] < pivot) {
				i = i + 1;
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		i = i + 1;
		int temp = A[i];
		A[i] = A[r];
		A[r] = temp;
		return i;
	}

	public static void quickSort(int A[], int p, int r) {
		if (p < r) {
			int q = partition(A, p, r);
			quickSort(A, p, q - 1);
			quickSort(A, q + 1, r);
		}
	}

	public static void main(String[] args) {
		int A[] = { 6, 3, 9, 5, 2, 8 };
		int n = A.length;
		quickSort(A, 0, n - 1);
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
	}
}

