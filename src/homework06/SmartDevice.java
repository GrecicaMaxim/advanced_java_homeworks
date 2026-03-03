package homework06;

public abstract class SmartDevice {
    String name;
    boolean isOn;

    public SmartDevice(String name) {
        this.name = name;
        this.isOn = false;
    }
    public SmartDevice(String name, boolean isOn) {
        this.name = name;
        this.isOn = isOn;
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println(this.name + " is turned on");
    }
    public void turnOff() {
        this.isOn = false;
        System.out.println(this.name + " is turned off");
    }
    public abstract void performAction();
}