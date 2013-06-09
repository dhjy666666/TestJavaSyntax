//: polymorphism/shape/Triangle.java
package TestJavaSyntax.polymorphism.shape;
import static TestJavaSyntax.util.Print.*;

public class Triangle extends Shape {
	public void draw(){
		print("Triangle.draw()");
	}
	public void erase(){
		print("Triangle.erase()");
	}
} ///:~