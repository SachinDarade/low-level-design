package factorydp.dialog;

public class UbuntuDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new UbuntuButton();
    }
}
