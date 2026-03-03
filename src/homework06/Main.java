package homework06;

public class Main {
    public static void main(String[] args) {
        SmartLight smartBulb = new SmartLight("TP-Link Tapo", true);
        SmartThermostat smartThermostat = new SmartThermostat("Ecobee Premium", 11.2);
        SmartSpeaker speaker = new SmartSpeaker("Alexa");

        smartBulb.turnOn();
        smartBulb.performAction();
        smartBulb.turnOff();

        smartThermostat.turnOn();
        smartThermostat.performAction();
        smartThermostat.turnOff();

        speaker.turnOn();
        speaker.performAction();
        speaker.connectToWifi("HomeWifi");
        speaker.executeVoiceCommand("play music");
        speaker.executeVoiceCommand("stop music");
        speaker.turnOff();
    }
}
