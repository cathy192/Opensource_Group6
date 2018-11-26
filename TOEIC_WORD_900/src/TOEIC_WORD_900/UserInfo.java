package TOEIC_WORD_900;

public class UserInfo {
	private String name;
	private String id;
	private String pass;
	
	UserInfo(String id, String pass){
		this.id=id;
		this.pass=pass;
	}
	
	UserInfo(String id, String pass, String name){
		this.id=id;
		this.pass=pass;
		this.name=name;
	}
	
	UserInfo(UserInfo uf){
		this.id=uf.id;
		this.pass=uf.pass;
		this.name=uf.name;
	}
	
	UserInfo(){
		this.id="none";
		this.pass="none";
		this.name="none";
	}
	
	void setName(String uName) {
		this.name=uName;
	}
	
	String getName() {
		return this.name;
	}
}
