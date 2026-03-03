package homework06;

public class SmartSpeaker extends SmartDevice implements VoiceControllable, Connectable {

    public SmartSpeaker(String name) {
        super(name);
    }
    public SmartSpeaker(String name, boolean isOn) {
        super(name, isOn);
    }

    @Override
    public void performAction() {
        if (isOn) {
            System.out.println("SmartSpeaker is performing action.");
        } else {
            System.out.println("SmartSpeaker " + name + " can't perform the action, because it's not turned on.");
        }
    }

    @Override
    public void executeVoiceCommand(String command) {
        if (isOn) {
            if (command.equals("play music")) {
                System.out.println("SmartSpeaker " + name + " is now playing the music.");
            } else if (command.equals("stop music")) {
                System.out.println("SmartSpeaker " + name + " has stopped the music.");
            }
        } else {
            System.out.println("SmartSpeaker " + name + " must be turned on before executing the command!");
        }
    }

    @Override
    public void connectToWifi(String networkName) {
        System.out.println("SmartSpeaker " + name + " is connected to the network " + networkName);
    }
}
