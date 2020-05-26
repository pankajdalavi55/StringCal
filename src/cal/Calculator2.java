package cal;

public class Calculator2 {
	String fname, lname;
	int mark, price, age;
	static String collegename ="Amrutvahini colllege of enginnering, Sangamner";
	public Calculator2(String fname, String lname, int mark, int price, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.mark = mark;
		this.price = price;
		this.age = age;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Calculator2() {
		super();
	}
	@Override
	public String toString() {
		return "Calculator2 [fname=" + fname + ", lname=" + lname + ", mark=" + mark + ", price=" + price + ", age="
				+ age + "]";
	}
	

}
