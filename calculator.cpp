#include <iostream>
using namespace std;

int main() {
    char choice;
    char answer;

    do {
        cout << "=====================================\n";
        cout << "Press 'a' to calculate for speed\n";
        cout << "Press 'b' to calculate for duration\n";
        cout << "Press 'c' to calculate for distance\n";
        cout << "=====================================\n";
        cin >> choice;

        if (choice == 'a') {
            double distance, time, speed;
            cout << "Enter distance in kilometers: ";
            cin >> distance;
            cout << "Enter duration in hours: ";
            cin >> time;
            speed = distance / time;
            cout << "The speed is " << speed << " KPH\n";
        } 
        else if (choice == 'b') {
            double distance, speed, time;
            cout << "Enter distance in kilometers: ";
            cin >> distance;
            cout << "Enter speed in kph: ";
            cin >> speed;
            time = distance / speed;
            cout << "The duration is " << time << " hour/s\n";
        } 
        else if (choice == 'c') {
            double speed, time, distance;
            cout << "Enter speed in kph: ";
            cin >> speed;
            cout << "Enter duration in hours: ";
            cin >> time;
            distance = speed * time;
            cout << "The distance is " << distance << " km\n";
        } 
        else {
            cout << "-------------------------------------\n";
            cout << "ERROR 404: The requested option was not found.\n";
            cout << "Please check your input and try again.\n";
            cout << "-------------------------------------\n";
        }

        cout << "-------------------------------------\n";
        cout << "Do you want to solve again? (y/n): ";
        cin >> answer;

    } while (answer == 'y' || answer == 'Y');

    cout << "Thanks for using the calculator\n";
    return 0;
}
