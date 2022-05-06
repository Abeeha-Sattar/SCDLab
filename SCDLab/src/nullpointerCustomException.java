
public class nullpointerCustomException  extends Exception{
	String msg = "";
	int i = 0;
	
	public nullpointerCustomException (String s) {
		msg = s;
		
	}
	
	public nullpointerCustomException (int s) {
		i = s;
		
	}
	
	public String toString() {
		return msg + " " + i;
	}
}
