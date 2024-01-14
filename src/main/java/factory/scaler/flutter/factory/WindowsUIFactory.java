package factory.scaler.flutter.factory;

import factory.scaler.flutter.components.button.Button;
import factory.scaler.flutter.components.button.WindowsButton;
import factory.scaler.flutter.components.menu.Menu;
import factory.scaler.flutter.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
