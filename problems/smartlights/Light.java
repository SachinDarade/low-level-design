package smartlights;

public class Light {
    private final String name;
    private boolean on;

    public Light(String name) {
        this.name = name;
    }

    public String getState() {
        if(on) {
            return "On";
        }
        else {
            return "Off";
        }
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }
}
