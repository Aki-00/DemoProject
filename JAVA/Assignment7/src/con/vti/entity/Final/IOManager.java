package con.vti.entity.Final;

import java.io.FileInputStream;

public class IOManager {

	public String readFile(String pathFile) {
		byte[] b = new byte[1024];
		
		int length = FileInputStream.read(b);
	}
}
