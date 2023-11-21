package smartlights;

public class LightController {
    private final ILightCommand onCommand;
    private final ILightCommand offCommand;
    public LightController(ILightCommand lightOnCommand, ILightCommand lightOffCommand) {
        this.onCommand = lightOnCommand;
        this.offCommand = lightOffCommand;
    }

    public void clickOn() {
        onCommand.execute();
    }

    public void clickOff() {
        offCommand.execute();
    }

}
