// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Receive an input string and number of iterations from the client.
            String inputString = args[0].toUpperCase();
            int numOfIterations = Integer.parseInt(args[1]);
            
            // Define the vowel letters string.
            String vowelLetters = "AEFHILMNORSX";

            // For loop to print the vowel letters while examining a/an.
            for (int i = 0; i < inputString.length(); i++) {
                char currentLetter = inputString.charAt(i);
                String checkLetter = "a"; // Case of non-vowel.
                String dynamicSpacing = "  "; // Case of non-vowel.
                // Check for case of a vowel letter.
                if (vowelLetters.indexOf(currentLetter) >= 0) {
                        checkLetter = "an"; // Case of vowel.
                        dynamicSpacing = " "; // Case of vowel/
                }
                // Print the letter with the dynamic spacing and a/an.
                System.out.println("Give me " + checkLetter + dynamicSpacing + currentLetter + ": " + currentLetter + "!");
            }

            // For loop to print the cheering stuff.
            System.out.println("What does that spell?");
            for (int i = 0; i < numOfIterations; i++) {
                System.out.println(inputString + "!!!");
            }
        }
}
