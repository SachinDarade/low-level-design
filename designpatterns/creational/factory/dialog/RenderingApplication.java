package creational.dialog;

// This is based on the example discussed here
// https://refactoring.guru/design-patterns/factory-method
public class RenderingApplication {
    public static void main(String[] args) {
        Dialog dialog = Renderer.initSystem("windows");
        dialog.render();
    }
}
