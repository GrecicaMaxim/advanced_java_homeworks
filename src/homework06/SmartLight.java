package homework06;

public class SmartLight extends SmartDevice {
    private boolean isDimmed;

    public SmartLight(String name, boolean isDimmed) {
        super(name);
        this.isDimmed = isDimmed;
    }
    public SmartLight(String name, boolean isDimmed, boolean isOn) {
        super(name, isOn);
        this.isDimmed = isDimmed;
    }

    @Override
    public void performAction() {
        if (isOn) {
            System.out.println(this.name + " is adjusting the luminosity for you.");
        } else {
            System.out.println(this.name + " must be turned on before performing the action!");
        }
    }
}