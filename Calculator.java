import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        char answer;

        do {
            System.out.println("=====================================");
            System.out.println("Press 'a' to calculate for speed");
            System.out.println("Press 'b' to calculate for duration");
            System.out.println("Press 'c' to calculate for distance");
            System.out.println("=====================================");
            choice = sc.next().charAt(0);

            if (choice == 'a') {
                double distance, time, speed;
                System.out.print("Enter distance in kilometers: ");
                distance = sc.nextDouble();
                System.out.print("Enter duration in hours: ");
                time = sc.nextDouble();
                speed = distance / time;
                System.out.println("The speed is " + speed + " KPH");
            } 
            else if (choice == 'b') {
                double distance, speed, time;
                System.out.print("Enter distance in kilometers: ");
                distance = sc.nextDouble();
                System.out.print("Enter speed in kph: ");
                speed = sc.nextDouble();
                time = distance / speed;
                System.out.println("The duration is " + time + " hour/s");
            } 
            else if (choice == 'c') {
                double speed, time, distance;
                System.out.print("Enter speed in kph: ");
                speed = sc.nextDouble();
                System.out.print("Enter duration in hours: ");
                time = sc.nextDouble();
                distance = speed * time;
                System.out.println("The distance is " + distance + " km");
            } 
            else {
                System.out.println("-------------------------------------");
                System.out.println("ERROR 404: The requested option was not found.");
                System.out.println("Please check your input and try again.");
                System.out.println("-------------------------------------");
            }

            System.out.println("-------------------------------------");
            System.out.print("Do you want to solve again? (y/n): ");
            answer = sc.next().charAt(0);

        } while (answer == 'y' || answer == 'Y');

        System.out.println("Thanks for using the calculator");
        sc.close();
    }
}
