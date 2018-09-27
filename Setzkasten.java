package dummy;

import java.util.ArrayList;

public class Setzkasten {
	private ArrayList<Textbaustein> textbausteine;
	
	public Setzkasten() {
		textbausteine = new ArrayList<>();
	}
	
	public ArrayList<Textbaustein> getTextbausteine() {
		return textbausteine;
	}
	
	public void addTextbaustein(String text) {
		textbausteine.add(new Textbaustein(text));
	}

}
