import java.io.IOException;

public class TestMySecurityManager {
	public static void main(String[] args){
		System.setSecurityManager(new MySecurityManager());
		try{
			MyFileInputStream fs = new MyFileInputStream("/Users/dinghui/Project/TestJavaSyntax/AccessController/test.txt");
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
