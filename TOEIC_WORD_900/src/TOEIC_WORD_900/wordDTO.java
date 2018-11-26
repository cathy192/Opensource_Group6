package TOEIC_WORD_900;

import TOEIC_WORD_900.wordDTO;

public class wordDTO {

	int unit;
	String word;
	String mean;
	boolean Wrong;
	static String highlight = "";
	
	public String getHighlight() {
		return highlight;
	}
	public void setHighlight(String highlight) {
		wordDTO.highlight = highlight;
	}
	
	public int getunit() {
		return unit;
	}
	public void setunit(int unit) {
		this.unit = unit;
	}
	public String word() {
		return word;
	}
	public void setword(String word) {
		this.word= word;
	}
	public String getmean() {
		return mean;
	}
	public void setmean(String mean) {
		this.mean = mean;
	}
	public boolean Wrong() {
		return Wrong;
	}
	public void setWrong(boolean wrong) {
		this.Wrong=Wrong;
	}
	
}
