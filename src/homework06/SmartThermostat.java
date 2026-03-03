package homework06;

public class SmartThermostat extends SmartDevice {
    private double targetTemperature;

    public SmartThermostat(String name, double targetTemperature) {
        super(name);
        this.targetTemperature = targetTemperature;
    }
    public SmartThermostat(String name, double targetTemperature, boolean isOn) {
        super(name, isOn);
        this.targetTemperature = targetTemperature;
    }

    public void setTemperature(double targetTemperature) {
        if (isOn) {
            this.targetTemperature = targetTemperature;
        } else {
            System.out.println(this.name + " is off. You can't set the temperature!");
        }
    }
    @Override
    public void performAction() {
        if (isOn) {
            System.out.println(this.name + " is adjusting the temperature to " + this.targetTemperature);
        } else {
            System.out.println(this.name + " must be turned on before performing the action!");
        }
    }
}