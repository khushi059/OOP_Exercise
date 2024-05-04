package bulb;

public class Lights {
    public static void main(String[] args) {
        // Instantiate several Bulb objects
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();
        Bulb bulb3 = new Bulb();

        // Turn on some bulbs
        bulb1.turnOn();
        bulb3.turnOn();

        // Check the state of the bulbs
        System.out.println("Bulb 1: " + bulb1);
        System.out.println("Bulb 2: " + bulb2);
        System.out.println("Bulb 3: " + bulb3);

        // Turn off bulb 1
        bulb1.turnOff();
        System.out.println("\nBulb 1: " + bulb1);
    }
}


