import java.io.FileInputStream;
import java.io.IOException;

public class TestMySecurityManager {
	public static void main(String[] args){
		System.setSecurityManager(new MySecurityManager());
		try{
			FileInputStream fs = new FileInputStream("test");
			System.out.println(fs.read());
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
