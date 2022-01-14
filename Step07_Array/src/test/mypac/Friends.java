package test.mypac;

public class Friends {
	private int num;
	private String name;
	private String phoneNum;
	private String sex;
	
	public Friends() {}
	
	public Friends(int num, String name, String phoneNum, String sex) {
		super();
		this.num = num;
		this.name = name;
		this.phoneNum = phoneNum;
		this.sex = sex;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
