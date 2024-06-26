// 1) Write a program to implement a class coordinate with a method to display the values
// of member variables. Assign the values of the member variable inside the main method.
// Use new this time.

class Coordinate {
    int x;
    int y;

    // Method to display values of member variables
    void displayCoordinates() {
        System.out.println("X: " + x + ", Y: " + y);
    }
}

public class Q1 {
    public static void main(String[] args) {
        // Creating an instance of the Coordinate class using 'new'
        Coordinate point = new Coordinate();

        // Assigning values to member variables
        point.x = 10;
        point.y = 20;

        // Displaying coordinates
        point.displayCoordinates();
    }
}
