
public class matrixRotation {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		// 489
		// 3710
		// 2611
		// 1512
		printMatrix(matrix);
		int[][] matrixAfterMatrixRotation = rotationMatrix(matrix);
		System.out.println();
		printMatrix(matrixAfterMatrixRotation);
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j > 0) {
					System.out.print(", ");
				}
				System.out.print(matrix[i][j]);
			}

			System.out.println();
		}
	}

	private static int[][] rotationMatrix(int[][] matrix) {
		int[][] matrixAfterMatrixRotation = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrixAfterMatrixRotation[matrix[i].length - j - 1][i] = matrix[i][j];
			}
		}

		return matrixAfterMatrixRotation;
	}

}
