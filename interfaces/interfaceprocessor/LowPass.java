//: interfaces/interfaceprocessor/LowPass.java
package TestJavaSyntax.interfaces.interfaceprocessor;

public class LowPass extends Filter {
	double cutoff;
	public LowPass(double cutoff) { this.cutoff = cutoff; }
	public Waveform process(Waveform input) {
		return input; // Dummy processing.
	}
} ///:~