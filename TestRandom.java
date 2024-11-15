public class TestRandom {
    public static void main(String[] args) {
        // Read the N of tests required.
        int numOfIterations = Integer.parseInt(args[0]);
        
		// Define counters.
        int countGreater = 0;
        int countLessOrEqual = 0;

        // Run the loop N times
        for (int i = 0; i < numOfIterations; i++) {
            // Create a random number.
            double randomValue = Math.random();
            
			// Check if the value is: (> 0.5) OR (<= 0.5).
            if (randomValue > 0.5) {
                countGreater++;
            } else {
                countLessOrEqual++;
            }
        }

        // Print counts for each case.
        System.out.println("> 0.5: " + countGreater + " times");
        System.out.println("<= 0.5: " + countLessOrEqual + " times");

        // Print ratio if not division by 0.
        if (countLessOrEqual != 0 && countGreater != 0) {
            double ratio = (double) countGreater / countLessOrEqual;
            System.out.println("Ratio: " + ratio);
        }
    }
}