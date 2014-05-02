import java.security.Permission;
import java.io.FilePermission;
import sun.security.util.SecurityConstants;
public class testImplies {
	public static void main(String[] args){
		Permission perOne = new FilePermission("d:/tmp/test.txt", SecurityConstants.FILE_READ_ACTION);
		Permission perAll = new FilePermission("d:/tmp/*", SecurityConstants.FILE_READ_ACTION);
		System.out.println(perOne.implies(perAll));
		System.out.println(perAll.implies(perOne));
	}
}
