package main;

public class SectionFive {
    public static void main(String[] args) {
        int switchInt = (int) Math.floor(Math.random()*6) + 1;

        switch (switchInt){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was a 3 or 4 or 5");
                break;

            default:
                System.out.println("Value was not between 1 and 5");
                break;
        }

        char switchChar = 'F';

        switch (switchChar){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(switchChar + " was found");
                break;

            default:
                System.out.println("Char not found");
                break;
        }
    }

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
