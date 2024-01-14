package factory.scaler.flutter.factory;

import factory.scaler.flutter.components.button.Button;
import factory.scaler.flutter.components.button.IOSButton;
import factory.scaler.flutter.components.menu.IOSMenu;
import factory.scaler.flutter.components.menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
