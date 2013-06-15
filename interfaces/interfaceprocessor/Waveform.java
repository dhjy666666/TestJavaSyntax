//: interfaces/interfaceprocessor/Waveform.java
package TestJavaSyntax.interfaces.interfaceprocessor;
public class Waveform {
	private static long counter;
	private final long id = counter++;
	public String toString() { return "Waveform " + id; }
} ///:~