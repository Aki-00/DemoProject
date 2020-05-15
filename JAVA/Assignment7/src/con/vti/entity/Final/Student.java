package con.vti.entity.Final;

public class Student {
private final int iD;
private String name;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getiD() {
	return iD;
}
public Student(int iD, String name) {
	super();
	this.iD = iD;
	this.name = name;
}

public final void study() {
	System.out.println("dang hoc bai...");
}

}
