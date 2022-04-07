
import java.io.Serializable;

public class Student implements Serializable {
	private int rolleNo;
	private String name;
	private int studentClass;
	public Student() {}
	public Student(int rolleNo, String name, int class1) {
		this.rolleNo = rolleNo;
		this.name = name;
		studentClass = class1;
	
	}
	public int getRolleNo() {
		return rolleNo;
	}
	public void setRolleNo(int rolleNo) {
		this.rolleNo = rolleNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getstudentClass() {
		return studentClass;
	}
	public void setClass(int class1) {
		studentClass = class1;
	}
	@Override
	public String toString() {
		return "Student [rolleNo=" + rolleNo + ", name=" + name + ", studentClass=" + studentClass + "]";
	}
	
	

}

