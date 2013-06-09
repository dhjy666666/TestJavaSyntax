//: polymorphism/shape/Circle.java
package TestJavaSyntax.polymorphism.shape;
import static TestJavaSyntax.util.Print.*;

public class Circle extends Shape {
	public void draw(){
		print("Circle.draw()");
	}
	public void erase(){
		print("Circle.erase()");
	}
} ///:~