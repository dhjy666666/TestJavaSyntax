import java.security.Permission;
import java.io.FilePermission;
import sun.security.util.SecurityConstants;

public class MySecurityManager extends SecurityManager {
	private boolean isLoaded = true;
	@Override
	public void checkRead(String file){
		checkPermission(new FilePermission(file, SecurityConstants.FILE_READ_ACTION));
	}

	@Override
	public void checkPermission(Permission perm){
		//MyAccessController.checkPermission(perm);
		if(isLoaded){
			isLoaded = false;
			System.out.println(MyAccessController.class.getClassLoader());
		}
	}
}
