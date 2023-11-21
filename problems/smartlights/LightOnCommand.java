package smartlights;

public class LightOnCommand implements ILightCommand{
    private Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void unExecute() {
        light.turnOff();
    }
}
