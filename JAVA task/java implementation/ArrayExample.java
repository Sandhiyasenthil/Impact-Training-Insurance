import java.util.Scanner;

public class ArrayExample { 
    public static void main(String[] args) {
        ArrayPractice practice = new ArrayPractice();
        practice.display(); 
    }
}

class ArrayPractice {
    void display() { 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] names = new String[size];

        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            names[i] = scanner.nextLine(); // Read a line of input
        }

        System.out.println("You entered:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}