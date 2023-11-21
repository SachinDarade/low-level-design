package smartlights;

public class ClientApplication {
    public static void main(String[] args) {
        AppRemote appRemote = new AppRemote();
        Light light1 = new Light("Philips");
        Light light2 = new Light("Wipro");

        LightController lightController1 = new LightController(
                new LightOnCommand(light1),
                new LightOffCommand(light1)
        );
        appRemote.addLightController(lightController1);

        LightController lightController2 = new LightController(
                new LightOnCommand(light2),
                new LightOffCommand(light2)
        );
        appRemote.addLightController(lightController2);

        appRemote.setActive(lightController1);
        System.out.println(light1.getState());
        appRemote.turnOn();
        System.out.println(light1.getState());

        appRemote.allLightsOff();
        System.out.println(light1.getState());
        System.out.println(light2.getState());

    }
}
