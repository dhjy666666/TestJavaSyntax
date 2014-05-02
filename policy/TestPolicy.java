import java.io.FileWriter;
import java.io.IOException;

public class TestPolicy{
	public static void main(String[] args){
		FileWriter writer;
		try{
			writer  = new FileWriter("/Users/dinghui/Project/TestJavaSyntax/policy/testPolicy.txt");
			writer.write("hello1");
			writer.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
