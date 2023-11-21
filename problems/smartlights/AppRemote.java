package smartlights;

import java.util.ArrayList;
import java.util.List;

public class AppRemote {
    private List<LightController> lightControllerList;

    public LightController getCurrActiveCtrl() {
        return currActiveCtrl;
    }

    private LightController currActiveCtrl;

    public AppRemote() {
        this.lightControllerList = new ArrayList<>();
        this.currActiveCtrl = null;
    }

    public void addLightController(LightController lightController) {
        lightControllerList.add(lightController);
    }

    public void setActive(LightController lightController) {
        this.currActiveCtrl = lightController;
    }

    public void turnOn() {
        if(currActiveCtrl == null) {
            System.out.println("Please select a light first");
        }
        System.out.println("Turning on the light");
        currActiveCtrl.clickOn();
    }

    public void turnOff() {
        if(currActiveCtrl == null) {
            System.out.println("Please select a light first");
        }
        System.out.println("Turning off the light");
        currActiveCtrl.clickOff();
    }

    public void allLightsOff() {
        System.out.println("Turning all lights off.");
        if(this.lightControllerList.isEmpty()) {
            System.out.println("Please add lights :)");
        }
        for(LightController lightController: lightControllerList)
            lightController.clickOff();
    }
}
