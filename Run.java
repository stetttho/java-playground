package dummy;

import java.util.ArrayList;

public class Run {
	
	static int[][] matrix = {{ 1, 2, 3 }, {4, 5, 6}, {7, 8, 9}};
	static CrackingCode cc = new CrackingCode();
	

	public static void main(String[] args) {
		Setzkasten setzkasten = new Setzkasten();
		ArrayList<Textbaustein> textbausteine = setzkasten.getTextbausteine();
		setzkasten.addTextbaustein("nur ein Test");
		setzkasten.addTextbaustein("nur ein zweiter Test");
		for (Textbaustein t : textbausteine) {
			System.out.println(t.getText());
		}
		
		for (int i = 0; i < matrix.length; i++ ) {
			System.out.println("");
			for(int j = 0; j < matrix.length; j++) {
			System.out.print(cc.rotateMatrix(matrix)[i][j]+ " ");
		}		
		}
		
		System.out.println("\n\nMusterlösung");
		
		cc.rotate(matrix);
		for (int i = 0; i < matrix.length; i++ ) {
			System.out.println("");
			for(int j = 0; j < matrix.length; j++) {
			System.out.print(matrix[i][j]+ " ");
		}
		}
	}

}
