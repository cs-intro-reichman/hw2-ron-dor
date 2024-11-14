// Notably, their way is the best way.
// But, I'd like to try it differently.
public class TimeCalc {
    public static void main(String[] args) {
        // Receive input from client.
        int DAILYMINUTES = 1440;
        int DAILYHOURS = 24;
        int MINUTESINHOUR = 60;
        int orgHours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int orgMinutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addMinutes = Integer.parseInt(args[1]);

        // Rather than conversion to total minutes, let's look at the jumps in days.
        int remainedMinutes = addMinutes % DAILYMINUTES;
        int remainedHours = remainedMinutes / MINUTESINHOUR;
        int newHours = (orgHours + remainedHours) % DAILYHOURS;
        remainedMinutes = remainedMinutes - (remainedHours * MINUTESINHOUR);
        int newMinutes = (orgMinutes + remainedMinutes) % 60;
        System.out.println(newHours + ":" + newMinutes);
    }
}
