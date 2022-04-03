
//התכנית מבצעת כפל בין שני מטריצות
public class doubleMatrix {
	public static void main(String[] args) {
		double[][] matrix1 = { { 2, 2, 2 },
					           { 2, 2, 2 },
					           { 2, 2, 2 } };
	
		double[][] matrix2 = { { 2, 2, 2 },
				               { 2, 2, 2 },
				               { 2, 2, 2 } };

		doubleMatrix(matrix1, matrix2);
	}

	public static double[][] doubleMatrix(double[][] matrix1, double[][] matrix2) {
		double [][] temp = new double [matrix1.length][matrix2[0].length];//start temp

//		for (int i = 0; i < temp.length; i++) {
//			for (int j = 0; j < temp[i].length; j++) {
//				temp[i][j] = 0;
//			}
//		}
		if (matrix1[0].length == matrix2.length) {
			int row1;
			int col1 = 0;
			int row2 = 0;
			int col2;

			for (int row = 0; row < temp.length; row++) {
				for (int col = 0; col < temp.length; col++) {

					row1 = row;
					col1 = 0;
					row2 = 0;
					col2 = col;

					for (int k = 0; k < matrix2.length; k++) {
						temp[row][col] += matrix1[row1][col1] * matrix2[row2][col2];
						col1++;
						row2++;
					}
				}
			}
			System.out.println("Double matrix:");
			for (int i = 0; i < temp.length; i++) {
				System.out.println();
				for (int j = 0; j < temp.length; j++) {
					System.out.print(temp[i][j] + "\t");
				}
			}
		} else {
			//if length row in matrix1 different from length column in matrix2;
			System.out.println("Errow, It is not possible to double");
		}
		return temp;

	}
}