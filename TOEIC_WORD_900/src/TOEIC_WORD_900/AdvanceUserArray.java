package TOEIC_WORD_900;

public class AdvanceUserArray {

	int cnt;
	String[] user = new String[300];
	
	AdvanceUserArray() {
		cnt=0;
	}
	
	public String getUser(int i) {
		return user[i];
	}
	public void setUser(String str) {
		user[cnt]=str;
		cnt++;
	}
	public int getCnt() {
		return cnt;
	}
}
