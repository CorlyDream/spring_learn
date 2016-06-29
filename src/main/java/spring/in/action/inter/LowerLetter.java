package spring.in.action.inter;

public class LowerLetter implements ChangeLetter {
	
	private String str;

	@Override
	public String change() {
		return str.toLowerCase();
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
