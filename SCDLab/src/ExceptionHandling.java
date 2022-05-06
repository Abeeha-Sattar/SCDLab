import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {
	
	
	static public void divbyzero () throws nullpointerCustomException{
		nullpointerCustomException ex = new nullpointerCustomException(22);
		throw ex;
	}
	
	public static void main(String[] args) {
		
		FileInputStream fin;
		
		try {
			fin = new FileInputStream("test.txt");
			int i;
			try {
			do {
				 i = fin.read();
				 System.out.print((char)i);
			}while (i != -1);
			} catch (IOException e) {
				System.out.println("IO Exception");
			} finally {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		
		
		

	}

}
