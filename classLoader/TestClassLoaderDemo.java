public class TestClassLoaderDemo{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException{
		Class thisCls = TestClassLoaderDemo.class;
		MyClassLoader myClassLoader = new MyClassLoader();
		System.out.println(thisCls.getClassLoader());
		System.out.println(myClassLoader.getParent());
		
		try{
			Class cls = myClassLoader.loadClass("TestBeLoader");
			System.out.println(cls.getClassLoader());
			TestBeLoader test = (TestBeLoader) cls.newInstance();
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}
