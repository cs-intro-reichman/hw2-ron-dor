// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		// Receive number of iterations from client.
	    int numOfTerms = Integer.parseInt(args[0]);
		// Initialize the sum and conduct iteration.
		double sum = 0.0;
		for (int i = 0; i < numOfTerms; i++) {
			sum += Math.pow(-1, i) / (2.0 * i + 1);
		}
		// Multiply by 4 to receive pi.
		sum *= 4;
		// Print the results.
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + sum);
	}
}
