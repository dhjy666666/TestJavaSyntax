//: initialization/VarArgs.java
// Using array syntax to create variable argument lists.
class A{}

public class VarArgs{
	static void printArray(Object... args){
		for(Object obj : args)
		{
			System.out.println(obj + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		// Can take individual elements:
		printArray(new Object[]{
			new Integer(47), new Float(3.14), new Double(11.11)
		});
		printArray(47, 3.14F, 11.11);
		printArray("one", "two", "three");
		printArray(new A(), new A(), new A());
		// Or an array:
		printArray((Object[]) new Integer[]{1, 2, 3, 4});
		printArray(); // Empty list is OK
	}
} /* Output: (sample)
47 3.14 11.11
47 3.14 11.11
one two three
A@1a46e30 A@3e25a5 A@19821f
1 2 3 4
*///:~