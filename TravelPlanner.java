import java.util.Random;
import java.util.Scanner;

public class TravelPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to the Travel Itinerary Planner\n Would you like to book? ");
        String YN = scanner.next();
        while (!YN.equalsIgnoreCase("Yes") && !YN.equalsIgnoreCase("No")) {
            System.out.println("Invalid Response");
            YN = scanner.next();

        }
        if (YN.equalsIgnoreCase("No")) {
            System.out.println("Goodbye!!");

        }
        while (true) {
            System.out.print("Enter your Details\n First Name: ");
            String Fname = scanner.next();
            System.out.print("Second Name: ");
            String Lname = scanner.next();
            System.out.print("Destination: ");
            String Destination = scanner.next();
            System.out.print("Date (YYYY-MM-DD): ");
            String Date = scanner.next();
            System.out.print("Any preferences: ");
            String Preferences = scanner.next();
            String mapUrl = getMapUrl(Destination);
            String weatherInfo = getWeatherInfo(Destination, Date);
            double budget = calculateBudget(Destination);

            System.out.println("-------------------------------------------------");
            System.out.println("\nThank you, " + Fname + " " + Lname + "!");
            System.out.println("Your travel details:");
            System.out.println("Destination: " + Destination);
            System.out.println("Date: " + Date);
            System.out.println("Preferences: " + Preferences);
            System.out.println("Map URL: " + mapUrl);
            System.out.println("Weather Information: " + weatherInfo);
            System.out.println("Estimated Budget: $" + budget);
            System.out.println("-------------------------------------------------");

            System.out.print("Would you like to book another trip? (Yes/No): ");
            String anotherTrip = scanner.next();
            while (!anotherTrip.equalsIgnoreCase("Yes") && !anotherTrip.equalsIgnoreCase("No")) {
                System.out.println("Invalid response. Please enter 'Yes' or 'No'.");
                System.out.print("Would you like to book another trip? (Yes/No): ");
                anotherTrip = scanner.next().trim();
            }

            if (anotherTrip.equalsIgnoreCase("No")) {
                System.out.println("Goodbye!!");
                break;
            }
        }

    }

    private static String getMapUrl(String Destination) {

        return "https://www.google.com/maps?q=" + Destination;
    }

    private static String getWeatherInfo(String Destination, String Date) {
        String[] weatherConditions = { "Sunny", "Windy", "Rainy", "Snowy" };
        Random random = new Random();
        String randomWeather = weatherConditions[random.nextInt(weatherConditions.length)];
        return "Weather forecast for " + Destination + " on " + Date + ": " + randomWeather;
    }

    private static double calculateBudget(String Destination) {
        Random random = new Random();
        return 1000 + random.nextInt(1501);
    }
}
