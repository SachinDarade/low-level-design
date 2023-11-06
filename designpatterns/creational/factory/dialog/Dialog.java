package creational.dialog;

public abstract class Dialog {

    public void render() {
        Button button = createButton();
        button.render();
    }

    protected abstract Button createButton();
}
