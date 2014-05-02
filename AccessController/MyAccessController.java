import java.security.AccessControlException;
import java.security.Permission;
import java.io.FilePermission;
import sun.security.util.SecurityConstants;

public class MyAccessController {
	private MyAccessController(){
		super();
	}

	public static void checkPermission(Permission perm) throws AccessControlException{
		Permission perAll = new FilePermission("/Users/dinghui/Project/TestJavaSyntax/AccessController/*",SecurityConstants.FILE_READ_ACTION);
		if(perAll.implies(perm)){
			System.out.println("你可以读取这个文件哦");
		}else{
			throw new AccessControlException("你没有读取这个文件的权限");
		}
	}
}
