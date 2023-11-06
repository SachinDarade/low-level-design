package creational.factory.dialog;

public class Renderer {

    static Dialog initSystem(String osName) {
        if("windows".equalsIgnoreCase(osName)) {
            return new WindowsDialog();
        } else if ("ubuntu".equalsIgnoreCase(osName)) {
            return new UbuntuDialog();
        }
        return null;
    }
}
