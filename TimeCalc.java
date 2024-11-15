// Notably, their way is the best way.
// But, I'd like to try it differently.
public class TimeCalc {
    public static void main(String[] args) {
        // Constants for calculations.
        int DAILYMINUTES = 1440;
        int DAILYHOURS = 24;
        int MINUTESINHOUR = 60;

        // Example: orgHours=10.
        int orgHours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        // Example: orgMinutes=30.
        int orgMinutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // Example: addMinutes=4055.
        int addMinutes = Integer.parseInt(args[1]);

        // Example: 1175 minutes to go after jumping 2 days to 10:30 precisely.
        int remainedMinutes = addMinutes % DAILYMINUTES;
        // Example: 19 hours to go on the third day.
        int remainedHours = remainedMinutes / MINUTESINHOUR;
        // Example: After jumping 19 hours, we'd have to add another 35 minutes.
        remainedMinutes = remainedMinutes % MINUTESINHOUR;

        // Example: (10+19)%24 gives us 5, that's the hour for now.
        int newHours = (orgHours + remainedHours) % DAILYHOURS;
        // Example: 30+35 gives us 65(>=60), later being taken care of.
        int newMinutes = orgMinutes + remainedMinutes;

        // Example: In our case, we jump another hour, hence must be treated.
        if (newMinutes >= MINUTESINHOUR) {
            newMinutes -= MINUTESINHOUR;
            newHours = (newHours + 1) % DAILYHOURS; // Modulo is a must, if we jump a day.
        }

        // We add the '0' if needed for presenting the time.
        String formattedHours = String.format("%02d", newHours);
        String formattedMinutes = String.format("%02d", newMinutes);

        // Print the final time format.
        System.out.println(formattedHours + ":" + formattedMinutes);
    }
}