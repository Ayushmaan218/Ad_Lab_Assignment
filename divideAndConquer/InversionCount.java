package divideAndConquer;

public class InversionCount {
	public static int Merge_Inversions(int A[], int p, int r) {
		return r;
		
	}
	public static int Count_Inversions(int A[], int p, int r) {
		int inversions = 0;
		if (p < r) {
			int q = (p + r) / 2;
			inversions += Count_Inversions(A, p, q);
			inversions += Count_Inversions(A, q - 1, r);
			inversions += Merge_Inversions(A, p + q, r);
		}
		return inversions;
	}

	public static void main(String[] args) {
		int A[] = { 6, 3, 9, 5, 2, 8 };
		int n = A.length;
		Count_Inversions(A, 0, n - 1);
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}

	}

}
