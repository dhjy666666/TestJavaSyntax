public class MySecurityManager extends SecurityManager {
	@Override
	public void checkRead(String file) {
		if(file.endsWith("test"))
		{
			throw new SecurityException("你没有读取本文件的权限");
		}
	}
}
