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
                String newLetter = Character.toString(currentLetter);
                String checkLetter;
                if (vowelLetters.contains(newLetter)) {
                        checkLetter = "an";
                } else {
                        checkLetter = "a";
                }
                System.out.println("Give me " + checkLetter + "  " + newLetter + ": " + newLetter + "!");
            }

            // For loop to print the cheering stuff.
            System.out.println("What does that spell?");
            for (int i = 0; i < numOfIterations; i++) {
                System.out.println(inputString + "!!!");
            }
        }
}
