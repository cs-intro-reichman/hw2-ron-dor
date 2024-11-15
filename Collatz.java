// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		// Receive number of sequences from client.
	    int numOfSequences = Integer.parseInt(args[0]);
		// Receive the mode required c/v.
		String modeRequired = args[1];
		// Initialize counters for sequence. (collection & terms)
		String collectSequence = "";
		int countTerms = 0;
		int currentNumber = 0;
		// This will help us to identify a case where i=1. (First iteration)
		boolean boolForOne = true;
		// Outer loop to iterate through the number of sequences.
		for (int i = 1; i <= numOfSequences; i++){
			// Inner loop to iterate through each sequence.
			currentNumber = i;
			collectSequence = collectSequence + currentNumber + " ";
			while (currentNumber != 1 || boolForOne) {
				// We change the boolean value to false, as the exception is no longer relevant.
				boolForOne = false;
				countTerms++;
				// Applying the even-number case.
				if (currentNumber % 2 == 0) {
					currentNumber = currentNumber / 2;
					// For '1', we'll then be out of the loop, so we adjust to it.
					if (currentNumber == 1) {
						countTerms++;
					}
					if (modeRequired.equals("v")) {
						collectSequence = collectSequence + currentNumber + " ";
					}
				// Applying the odd-number case.
				} else {
					currentNumber = currentNumber * 3 + 1;
					if (modeRequired.equals("v")) {
						collectSequence = collectSequence + currentNumber + " ";
					}
				}
			}
			// Printing the sequence is required should 'v' be entered.
			if (modeRequired.equals("v")) {
				System.out.println(collectSequence + "(" + countTerms + ")");
			}
			// Later, we'll do it over and over again, for each sequence.
			countTerms = 0;
			collectSequence = "";
		}
		// Relevant for both cases c/v.
		System.out.println("Every one of the first " + numOfSequences + " hailstone sequences reached 1.");
	}
}