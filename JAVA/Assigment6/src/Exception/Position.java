package Exception;


public class Position extends ScannerUtils{
	private byte id;
	private String name;
	
	public Position() {
		id = (byte) inputInt("Error! Please input again");
		name = inputString();
	}
	
	@Override
	public int inputInt(String errorMessage) {
		System.out.println("Moi ban nhap vao ID position");
		return super.inputInt(errorMessage);
	}
	
	@Override
	public String inputString() {
		System.out.println("Moi ban nhap vao ten position");
		return super.inputString();
	}

	public byte getId() {
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
	
	
}
