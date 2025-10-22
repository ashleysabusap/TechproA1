import java.util.Scanner;

public class Seatworkforteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Motorcycle m = new Motorcycle();
        m.make = "kawasaki 1000cc";
        m.color = "blue";

        System.out.println("Type 'on' to start the engine, or 'show' to view attributes:");
        System.out.println("engine state is off");
        String command = input.nextLine();

        if (command.equalsIgnoreCase("on")) {
            System.out.println("Engine starting...");
            m.startEngine();
        } else if (command.equalsIgnoreCase("show")) {
            m.showAtts();
        } else {
            System.out.println("Unknown command.");
        }

        input.close();
    }
}

class Motorcycle {
    String make;
    String color;
    boolean engineState = false;

    void startEngine() {
        if (engineState) {
            System.out.println("The engine is already on.");
        } else {
            System.out.println("The engine is now on.");
            engineState = true;
        }
    }

    void showAtts() {
        System.out.println("This motorcycle is a " + color + " " + make);
        System.out.println("Engine state: " + (engineState ? "on" : "off"));
    }
}