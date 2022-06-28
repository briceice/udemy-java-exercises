package main;

public class intro {
    public static void main(String[] args) {
        // Ternary
        int age = (int) Math.ceil((Math.random()*20));
        System.out.println(age);
        String isEighteenOrOver = (age >= 18) ? "yes" : "no";
        System.out.println(isEighteenOrOver);

        // Operator Challenge
        double double1 = 20.00;
        double double2 = 80.00;
        double result = (double1 + double2) * 100.00;
        System.out.println("Result = " + result);
        double remainder = result % 40.00;
        System.out.println("Remainder = " + remainder);
        boolean remainderIsZero = (remainder == 0) ? true : false;
        System.out.println("Remainder is zero: " + remainderIsZero);
        if (!remainderIsZero) {
            System.out.println("Got some remainder");
        }

        displayHighScorePosition("Bob", calculateHighScorePosition(1500));
        displayHighScorePosition("Jack", calculateHighScorePosition(900));
        displayHighScorePosition("Tom", calculateHighScorePosition(400));
        displayHighScorePosition("Dan", calculateHighScorePosition(50));

        // Seconds and minutes Challenge
        System.out.println(getDurationString(65,30));
        System.out.println(getDurationString(4201));

    }

    public static void displayHighScorePosition(String name, int position){
        System.out.printf("%s managed to get into position %d\n", name, position);
    }

    public static int calculateHighScorePosition(int score){
        int position = 4;
        if (score > 1000){
            position = 1;
        } else if (score > 500) {
            position = 2;
        } else if (score > 100) {
            position = 3;
        }
        return position;
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid value";
        }
        int hours = minutes / 60;
        int remainderMinutes = minutes % 60;
        return hours + "h " + remainderMinutes + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainderSeconds = seconds % 60;
        return getDurationString(minutes, remainderSeconds);
    }
}
