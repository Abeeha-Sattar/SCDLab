import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class tryWithResources {

	public static void main(String[] args) {
		
		try ( FileInputStream fin = new FileInputStream("test.txt")){
			int i;
			do {
				 i = fin.read();
				 System.out.print((char)i);
			}while (i != -1);
		} catch (IOException e) {
			
		}

	}

}
