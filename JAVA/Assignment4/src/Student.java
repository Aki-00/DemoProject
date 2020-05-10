
public class Student {

	private int id;
	private byte age;
	private String name;
	private String clazz;
	
	Student(){
		
	}
	
	Student(int id, String name){
		this.id =id;
		this.name =name;
		clazz = "Lop 10";
	}
	
	//tao ham getter
	public byte getAge(int tuoiCuaBan) {
		if (tuoiCuaBan <10) {
			return age;
		}else 
			return 30;
		}
		
	
	//Tao ham setter
	public void setAge(byte i) {
		this.age=i;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setClazz(String clazz) {
		this.clazz=clazz;
	}
}
