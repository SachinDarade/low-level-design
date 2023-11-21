package smartlights;

public class LightOffCommand implements ILightCommand {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void unExecute() {
        light.turnOn();
    }
}
