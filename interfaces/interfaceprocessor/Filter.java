//: interfaces/interfaceprocessor/Filter.java
package TestJavaSyntax.interfaces.interfaceprocessor;

public class Filter {
	public String name() {
		return getClass().getSimpleName();
	}
	public Waveform process(Waveform input) { return input; }
} ///:~

