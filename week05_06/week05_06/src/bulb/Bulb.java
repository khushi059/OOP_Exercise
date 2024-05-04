package bulb;

class Bulb {
    private boolean isOn;

    // Constructor to initialize the bulb as off
    public Bulb() {
        isOn = false;
    }

    // Method to turn the bulb on
    public void turnOn() {
        isOn = true;
    }

    // Method to turn the bulb off
    public void turnOff() {
        isOn = false;
    }

    // Method to check if the bulb is on
    public boolean isOn() {
        return isOn;
    }

    // toString method to return the state of the bulb
    @Override
    public String toString() {
        return isOn ? "The bulb is on" : "The bulb is off";
    }
}

