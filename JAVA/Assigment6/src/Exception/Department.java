package Exception;



public class Department extends ScannerUtils{
	private int id;
	private String name;
	
	public Department(int id, String name) {
		this.id =id;
		this.name =name;
	}
	
	public Department() {
		id = inputInt("Error! Please input again");
		name = inputString();
	}
	public int getId() {
		return id;
	}
	public void setId(byte id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int inputInt(String errorMessage) {
		System.out.println("Moi ban nhap vao ID department");
		return super.inputInt(errorMessage);
	}
	
	@Override
	public String inputString() {
		System.out.println("Moi ban nhap vao ten department");
		return super.inputString();
	}
}
