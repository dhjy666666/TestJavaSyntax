//: polymorphism/shape/Square.java
package TestJavaSyntax.polymorphism.shape;
import static TestJavaSyntax.util.Print.*;

public class Square extends Shape {
	public void draw(){
		print("Square.draw()");
	}
	public void erase(){
		print("Square.erase()");
	}
} ///:~