package dummy;

public class CrackingCode {
	
	public int[][] rotateMatrix(int[][] matrix) {
		if(matrix.length != matrix[0].length) {
			System.out.println("matrix needs to be NxN");
			return new int[0][0];
		}
		int[][] matrix2 = new int[matrix.length][matrix.length];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				matrix2[j][matrix.length-1-i] = matrix[i][j];
			}
		}
		return matrix2;
	}
	
	boolean rotate(int[][] matrix) {
		if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
		int n = matrix.length;
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i];
				
				matrix[first][i] = matrix[last-offset][first];
				
				matrix[last-offset][first] = matrix[last][last-offset];
				
				matrix[last][last-offset] = matrix[i][last];
				
				matrix[i][last] = top;
			}
		}
		
		
		return true;
	}

}
